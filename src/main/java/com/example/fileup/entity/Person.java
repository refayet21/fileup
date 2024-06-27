package com.example.fileup.entity;

import jakarta.persistence.Entity;

//package com.example.uploadingfiles;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Person {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String filePath;

 // Getters and Setters
 public Long getId() {
     return id;
 }

 public void setId(Long id) {
     this.id = id;
 }

 public String getFilePath() {
     return filePath;
 }

 public void setFilePath(String filePath) {
     this.filePath = filePath;
 }
}

