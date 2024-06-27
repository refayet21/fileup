package com.example.fileup.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.fileup.entity.Person;
import com.example.fileup.repository.PersonRepository;

//PersonServiceImpl.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    private final FileStorageService fileStorageService;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository, FileStorageService fileStorageService) {
        this.personRepository = personRepository;
        this.fileStorageService = fileStorageService;
    }

    @Override
    public Person save(MultipartFile file) {
        fileStorageService.store(file);
        Person person = new Person();
        person.setFilePath(file.getOriginalFilename());
        return personRepository.save(person);
    }
}