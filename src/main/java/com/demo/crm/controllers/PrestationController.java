package com.demo.crm.controllers;

import com.demo.crm.models.Prestation;
import com.demo.crm.services.PrestationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PrestationController {
    @Autowired
    PrestationService prestations;

    // POST (Created)
    @PostMapping("prestations")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody Prestation p) {
        prestations.add(p);
    }

    // GET (Read all)
    @GetMapping("prestations")
    public List<Prestation> getList() {
        return prestations.getAll();
    }

    // GET (Read by id)
    @GetMapping("prestations/{id}")
    public ResponseEntity<Prestation> getById(@PathVariable("id") Integer id) {
        Optional<Prestation> opt = prestations.findById(id);
        if (opt.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            Prestation prestation = opt.get();
            return ResponseEntity.ok(prestation);
        }
    }

    // PUT (Update)
    @PutMapping("prestations/{id}")
    public ResponseEntity<Prestation> update(@RequestBody Prestation prestation,
                                             @PathVariable("id") Integer id) {
        if (!prestation.getId().equals(id)) {
            return ResponseEntity.notFound().build();
        } else {
            prestations.update(prestation);
            return ResponseEntity.ok().build();
        }
    }

    // DELETE (Delete)
    @DeleteMapping("prestations/{id}")
    public ResponseEntity<Prestation> delete(@PathVariable("id") Integer id) {
        if(prestations.findById(id).isPresent()){
            prestations.delete(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
