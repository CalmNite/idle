package com.gorkane.idle.services;
import java.util.List;
import java.util.Optional;


import com.gorkane.idle.models.Active;

public interface ActiveService {
    List<Active> findAll();
    Optional<Active> findId(Long id);
    Active save(Active active);
    void delete(Long id);

}
