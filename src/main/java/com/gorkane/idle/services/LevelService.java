package com.gorkane.idle.services;
import java.util.List;
import java.util.Optional;


import com.gorkane.idle.models.Level;

public interface LevelService {
    List<Level> findAll();
    Optional<Level> findId(Long id);
    Level save(Level level);
    void delete(Long id);

}


