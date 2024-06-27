package com.example.fileup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.example.fileup.config.StorageProperties;
import com.example.fileup.service.FileStorageService;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class FileupApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileupApplication.class, args);
	}
	
	   @Bean
	    CommandLineRunner init(FileStorageService fileStorageService) {
	        return (args) -> {
	            fileStorageService.deleteAll();
	            fileStorageService.init();
	        };
	    }
}
