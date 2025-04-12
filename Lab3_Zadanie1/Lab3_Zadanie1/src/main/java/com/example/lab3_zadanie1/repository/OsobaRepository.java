package com.example.lab3_zadanie1.repository;

import com.example.lab3_zadanie1.model.Osoba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OsobaRepository extends JpaRepository<Osoba, Long> {

}
