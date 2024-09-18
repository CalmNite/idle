package com.gorkane.idle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gorkane.idle.models.Active;
import com.gorkane.idle.repositories.ActiveRepository;

@Service
public class ActiveServiceImp implements ActiveService{

    @Autowired
    private ActiveRepository repository;

    @Override
    public List<Active> findAll() {
        return (List<Active>) repository.findAll();
    }

    @Override
    public Optional<Active> findId(Long id) {
        return repository.findById(id);
    }

    @Override
    public Active save(Active active) {
        return repository.save(active);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
    
}
