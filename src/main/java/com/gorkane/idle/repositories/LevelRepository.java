package com.gorkane.idle.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gorkane.idle.models.Level;

public interface LevelRepository extends CrudRepository<Level, Long> {
    
}