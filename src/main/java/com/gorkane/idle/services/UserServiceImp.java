package com.gorkane.idle.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gorkane.idle.models.User;
import com.gorkane.idle.repositories.UserRepository;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findAll() {
        return (List<User>) repository.findAll();
    }

    @Override
    public Optional<User> findId(Long id) {
        return repository.findById(id);
    }

    @Override
    public User save(User User) {
        return repository.save(User);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
    
}
