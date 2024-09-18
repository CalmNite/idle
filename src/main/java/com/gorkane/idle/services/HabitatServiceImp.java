package com.gorkane.idle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gorkane.idle.models.Habitat;
import com.gorkane.idle.repositories.HabitatRepository;

@Service
public class HabitatServiceImp implements HabitatService{

    @Autowired
    private HabitatRepository repository;

    @Override
    public List<Habitat> findAll() {
        return (List<Habitat>) repository.findAll();
    }

    @Override
    public Optional<Habitat> findId(Long id) {
        return repository.findById(id);
    }

    @Override
    public Habitat save(Habitat Habitat) {
        return repository.save(Habitat);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
    
}
