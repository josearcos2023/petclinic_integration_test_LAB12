package com.tecsup.petclinic.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tecsup.petclinic.entities.Vet;

@Repository
public interface VetRepository
        extends CrudRepository<Vet, Integer> {

    List<Vet> findByFirstName(String name);

    //List<Vet> findById(int id);

    @Override
    List<Vet> findAll();
}
