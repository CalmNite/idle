package com.gorkane.idle.controllers;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gorkane.idle.models.Mission;
import com.gorkane.idle.services.MissionService;

@RestController
public class MissionController {

    @Autowired
    private MissionService service;

    @GetMapping("/missions")
    public ResponseEntity<List<Mission>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/mission/{id}")
    public ResponseEntity<?> getId(@PathVariable Long id){
        Optional<Mission> usuarioOptional = service.findId(id);
        //service.findId(id);
        if (usuarioOptional.isPresent()){
            return ResponseEntity.ok().body(usuarioOptional.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/mission")
    public ResponseEntity<?> create(@Validated @RequestBody Mission mission){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(mission));
    }

    @DeleteMapping("/missions/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        Optional<Mission> o = service.findId(id);
        if (o.isPresent()){
            service.delete(id);
            return ResponseEntity.noContent().build();
        } 
        return ResponseEntity.notFound().build();
    }
}
