package com.gorkane.idle.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gorkane.idle.models.Habitat;

public interface HabitatRepository extends CrudRepository<Habitat, Long> {
    
}