package com.gorkane.idle.services;
import java.util.List;
import java.util.Optional;


import com.gorkane.idle.models.Mission;

public interface MissionService {
    List<Mission> findAll();
    Optional<Mission> findId(Long id);
    Mission save(Mission mission);
    void delete(Long id);

}

