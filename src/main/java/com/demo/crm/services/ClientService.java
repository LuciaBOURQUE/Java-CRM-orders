package com.demo.crm.services;

import com.demo.crm.models.Client;
import com.demo.crm.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;

    // CREATED (save)
    public void add(Client c) {
        clientRepository.save(c);
    }

    // READ (findAll)
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    // READ (findById)
    public Optional<Client> findById(Integer id) {
        return clientRepository.findById(id);
    }

    // UPDATE (save)
    public void update(Client c) {
        clientRepository.save(c);
    }

    // DELETE (deleteById)
    public void delete(Integer id) {
        clientRepository.deleteById(id);
    }
}
