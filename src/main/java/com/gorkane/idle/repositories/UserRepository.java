package com.gorkane.idle.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gorkane.idle.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
    
}

