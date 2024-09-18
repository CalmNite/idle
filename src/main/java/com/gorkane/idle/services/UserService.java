package com.gorkane.idle.services;
import java.util.List;
import java.util.Optional;


import com.gorkane.idle.models.User;

public interface UserService {
    List<User> findAll();
    Optional<User> findId(Long id);
    User save(User user);
    void delete(Long id);

}

