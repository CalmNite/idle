package com.gorkane.idle.services;

import java.util.List;
import java.util.Optional;


import com.gorkane.idle.models.Habitat;

public interface HabitatService {
    List<Habitat> findAll();
    Optional<Habitat> findId(Long id);
    Habitat save(Habitat habitat);
    void delete(Long id);

}


