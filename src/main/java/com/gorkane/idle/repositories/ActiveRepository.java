package com.gorkane.idle.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gorkane.idle.models.Active;

public interface ActiveRepository extends CrudRepository<Active, Long> {
    
}
