package com.demo.crm.repositories;

import com.demo.crm.models.Prestation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestationRepository extends JpaRepository<Prestation, Integer> {
    // empty
}
