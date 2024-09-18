package com.gorkane.idle.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gorkane.idle.models.Animal;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
    
}
