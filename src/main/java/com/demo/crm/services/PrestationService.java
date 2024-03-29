package com.demo.crm.services;

import com.demo.crm.models.Prestation;
import com.demo.crm.repositories.PrestationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrestationService {
    @Autowired
    PrestationRepository prestationRepository;

    // CREATED (save)
    public void add(Prestation p) {
        prestationRepository.save(p);
    }

    // READ (findAll)
    public List<Prestation> getAll() {
        return prestationRepository.findAll();
    }

    // READ by (findById)
    public Optional<Prestation> findById(Integer id) {
        return prestationRepository.findById(id);
    }

    // UPDATE (save)
    public void update(Prestation p) {
        prestationRepository.save(p);
    }

    // DELETE (deleteById)
    public void delete(Integer id) {
        prestationRepository.deleteById(id);
    }
}
