package com.task.application.utils;

import com.task.model.Document;
import com.task.repository.DocumentRepository;
import com.task.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class DatabaseRunner implements CommandLineRunner {

    @Autowired
    DocumentRepository repo;

    @Autowired
    DocumentService docService;

    @Override
    public void run(String... args) throws Exception {

        repo.save(new Document(docService.createUuid(), "dock1"));
        repo.save(new Document(docService.createUuid(), "dock2"));
        repo.save(new Document(docService.createUuid(), "dock3"));
    }
}
