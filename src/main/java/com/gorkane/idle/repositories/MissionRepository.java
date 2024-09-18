package com.gorkane.idle.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gorkane.idle.models.Mission;

public interface MissionRepository extends CrudRepository<Mission, Long> {
    
}