package com.netzwerk.ecomm.serv;

import com.netzwerk.ecomm.dto.EcomDTO;
import com.netzwerk.ecomm.repository.EcomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EcomServImpl {
    @Autowired
    private EcomRepo repo;

    public boolean save(EcomDTO dto) {
        repo.save(dto);
        return true;
    }

    public EcomDTO findById(Integer id) {
        Optional<EcomDTO> ecomDTO =repo.findById(id);
        return ecomDTO.get();
    }

    public List<EcomDTO> findByName(String name){
        List<EcomDTO> dto = repo.findByName(name);
        dto.toString();
        return dto;
    }

    public Page<EcomDTO> findAll(int pageMin, int pageMax, String sortBy, String sortDirection){
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
        Pageable pageable = PageRequest.of(pageMin, pageMax, sort);
        return repo.findAll(pageable);
    }

}
