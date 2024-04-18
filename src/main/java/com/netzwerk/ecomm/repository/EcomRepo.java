package com.netzwerk.ecomm.repository;

import com.netzwerk.ecomm.dto.EcomDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface EcomRepo extends JpaRepository<EcomDTO, Integer> {

    List<EcomDTO> findByName(String name);

//    EcomDTO findByName(String name);

}
