package com.gorkane.idle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gorkane.idle.models.Animal;
import com.gorkane.idle.repositories.AnimalRepository;

@Service
public class AnimalServiceImp implements AnimalService{

    @Autowired
    private AnimalRepository repository;

    @Override
    public List<Animal> findAll() {
        return (List<Animal>) repository.findAll();
    }

    @Override
    public Optional<Animal> findId(Long id) {
        return repository.findById(id);
    }

    @Override
    public Animal save(Animal Animal) {
        return repository.save(Animal);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
    
}
