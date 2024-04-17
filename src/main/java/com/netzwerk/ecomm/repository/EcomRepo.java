package com.netzwerk.ecomm.repository;

import com.netzwerk.ecomm.dto.EcomDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface EcomRepo extends JpaRepository<EcomDTO, Integer> {

}
