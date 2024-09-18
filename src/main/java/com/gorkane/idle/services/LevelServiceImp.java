package com.gorkane.idle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gorkane.idle.models.Level;
import com.gorkane.idle.repositories.LevelRepository;

@Service
public class LevelServiceImp implements LevelService{

    @Autowired
    private LevelRepository repository;

    @Override
    public List<Level> findAll() {
        return (List<Level>) repository.findAll();
    }

    @Override
    public Optional<Level> findId(Long id) {
        return repository.findById(id);
    }

    @Override
    public Level save(Level Level) {
        return repository.save(Level);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
    
}
