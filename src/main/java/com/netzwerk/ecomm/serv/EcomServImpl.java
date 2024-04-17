package com.netzwerk.ecomm.serv;

import com.netzwerk.ecomm.dto.EcomDTO;
import com.netzwerk.ecomm.repository.EcomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
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
        repo.findById(id);
        return null;
    }

}
