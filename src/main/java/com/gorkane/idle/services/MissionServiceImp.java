package com.gorkane.idle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gorkane.idle.models.Mission;
import com.gorkane.idle.repositories.MissionRepository;

@Service
public class MissionServiceImp implements MissionService{

    @Autowired
    private MissionRepository repository;

    @Override
    public List<Mission> findAll() {
        return (List<Mission>) repository.findAll();
    }

    @Override
    public Optional<Mission> findId(Long id) {
        return repository.findById(id);
    }

    @Override
    public Mission save(Mission Mission) {
        return repository.save(Mission);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
    
}
