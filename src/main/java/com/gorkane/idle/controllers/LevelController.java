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

import com.gorkane.idle.models.Level;
import com.gorkane.idle.services.LevelService;

@RestController
public class LevelController {

    @Autowired
    private LevelService service;

    @GetMapping("/levels")
    public ResponseEntity<List<Level>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/level/{id}")
    public ResponseEntity<?> getId(@PathVariable Long id){
        Optional<Level> usuarioOptional = service.findId(id);
        //service.findId(id);
        if (usuarioOptional.isPresent()){
            return ResponseEntity.ok().body(usuarioOptional.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/level")
    public ResponseEntity<?> create(@Validated @RequestBody Level level){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(level));
    }

    @DeleteMapping("/levels/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        Optional<Level> o = service.findId(id);
        if (o.isPresent()){
            service.delete(id);
            return ResponseEntity.noContent().build();
        } 
        return ResponseEntity.notFound().build();
    }
}
