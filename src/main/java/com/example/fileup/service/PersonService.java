package com.example.fileup.service;


import org.springframework.web.multipart.MultipartFile;

import com.example.fileup.entity.Person;

//PersonService.java

import org.springframework.web.multipart.MultipartFile;

public interface PersonService {
    Person save(MultipartFile file);
}