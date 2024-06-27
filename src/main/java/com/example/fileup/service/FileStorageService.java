package com.example.fileup.service;


import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.web.multipart.MultipartFile;

public interface FileStorageService {
    void init();

    void store(MultipartFile file);

    Stream<Path> loadAll();

    Path load(String filename);

    void deleteAll();
}
