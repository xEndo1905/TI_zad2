package com.example.lab3_zadanie1;

import com.example.lab3_zadanie1.model.Osoba;
import com.example.lab3_zadanie1.repository.OsobaRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab3Zadanie1Application {

    public static void main(String[] args) {

        SpringApplication.run(Lab3Zadanie1Application.class, args);
    }


    @Bean
    @Transactional
    public CommandLineRunner run(OsobaRepository repository){
        return args -> {
            insertNewPeople(repository);
            System.out.println((repository.findAll()));
        };
    }

    private void insertNewPeople(OsobaRepository repository) {
        repository.save(new Osoba(24, "Paweł"));
        repository.save(new Osoba(55, "Krystyna"));
        repository.save(new Osoba(45, "Agnieszka"));
        repository.save(new Osoba(35, "Marek"));
        repository.save(new Osoba(15, "Bronisław"));
        repository.save(new Osoba(65, "Małgorzata"));

    }

}