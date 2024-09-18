package com.gorkane.idle.services;
import java.util.List;
import java.util.Optional;


import com.gorkane.idle.models.Animal;

public interface AnimalService {
    List<Animal> findAll();
    Optional<Animal> findId(Long id);
    Animal save(Animal animal);
    void delete(Long id);

}

