package com.netzwerk.ecomm.serv;

import com.netzwerk.ecomm.dto.EcomDTO;
import com.netzwerk.ecomm.repository.EcomRepo;
//import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//@Slf4j
public class EcomServImpl {

    private static final Logger log = LoggerFactory.getLogger(EcomServImpl.class);
    @Autowired
    private EcomRepo repo;

    public boolean save(EcomDTO dto) {
        log.info("inside save dto method");
        repo.save(dto);
        return true;
    }

    public EcomDTO findById(Integer id) {
        log.info("inside find device by Id method");
        Optional<EcomDTO> ecomDTO = repo.findById(id);
        return ecomDTO.get();
    }

    public List<EcomDTO> findByName(String name) {
        log.info("inside find device by name method");
        List<EcomDTO> dto = repo.findByName(name);
        dto.toString();
        return dto;
    }

    public Page<EcomDTO> findAll(int pageMin, int pageMax, String sortBy, String sortDirection) {
        log.info("inside find all devices method");
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
        Pageable pageable = PageRequest.of(pageMin, pageMax, sort);
        return repo.findAll(pageable);
    }

}
