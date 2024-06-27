package com.example.fileup.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.example.fileup.entity.Person;
import com.example.fileup.service.PersonService;



@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/upload")
    public Person handleFileUpload(@RequestParam("file") MultipartFile file) {
        return personService.save(file);
    }
}
