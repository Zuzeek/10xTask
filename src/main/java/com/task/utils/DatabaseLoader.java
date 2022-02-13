package com.task.utils;

import com.task.application.Application;
import com.task.model.Document;
import com.task.repository.DocumentRepository;
import com.task.service.DocumentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private static final Logger LOG =  LoggerFactory.getLogger(Application.class);

    @Autowired
    DocumentService docService;

    @Override
    public void run(String... args) throws Exception {

        LOG.info("Preloading: " + new Document(docService.createUuid(), "dock1"));
        LOG.info("Preloading: " + new Document(docService.createUuid(), "dock2"));
        LOG.info("Preloading: " + new Document(docService.createUuid(), "dock3"));
    }
}
