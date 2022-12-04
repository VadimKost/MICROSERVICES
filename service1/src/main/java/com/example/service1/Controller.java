package com.example.service1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/service1")
public class Controller {

    @Autowired
    ContactBookRepository repository;

    @GetMapping("/")
    public List<Contacts> home() {
        List<Contacts> contacts = (List<Contacts>) repository.findAll();
        System.out.println(contacts);
        return contacts;
    }

    @PostMapping("/")
    public Contacts home(@RequestBody Contacts c) {
        Contacts contact = repository.save(c);
        return contact;
    }
}

