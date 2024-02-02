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

    // CREATED
    public void add(Client c) {
        clientRepository.save(c);
    }

    // READ all
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    // READ by id
    public Optional<Client> findById(Integer id) {
        return clientRepository.findById(id);
    }

    // UPDATE
    public void update(Client c) {
        clientRepository.save(c);
    }

    // DELETE
    public void delete(Client c) {
        clientRepository.delete(c);
    }
}
