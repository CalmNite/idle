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

import com.gorkane.idle.models.Active;
import com.gorkane.idle.services.ActiveService;

@RestController
public class ActiveController {

    @Autowired
    private ActiveService service;

    @GetMapping("/actives")
    public ResponseEntity<List<Active>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/active/{id}")
    public ResponseEntity<?> getId(@PathVariable Long id){
        Optional<Active> usuarioOptional = service.findId(id);
        //service.findId(id);
        if (usuarioOptional.isPresent()){
            return ResponseEntity.ok().body(usuarioOptional.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/active")
    public ResponseEntity<?> create(@Validated @RequestBody Active active){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(active));
    }

    @DeleteMapping("/actives/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        Optional<Active> o = service.findId(id);
        if (o.isPresent()){
            service.delete(id);
            return ResponseEntity.noContent().build();
        } 
        return ResponseEntity.notFound().build();
    }
}
