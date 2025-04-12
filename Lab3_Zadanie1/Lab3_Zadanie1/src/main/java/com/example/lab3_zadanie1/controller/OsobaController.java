package com.example.lab3_zadanie1.controller;

import com.example.lab3_zadanie1.model.Osoba;
import com.example.lab3_zadanie1.repository.OsobaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/osoby")
public class OsobaController {

    private final OsobaRepository repository;

    public OsobaController(OsobaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Osoba> getAllOsoby() {
        return repository.findAll();
    }

    @PostMapping
    public Osoba createOsoba(@RequestBody Osoba osoba){
        return repository.save(osoba);
    }
}
