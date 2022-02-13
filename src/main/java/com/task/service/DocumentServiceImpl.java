package com.task.service;

import com.task.model.Document;
import com.task.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    DocumentRepository repo;

    Document newDocument = new Document();

    @Override
    public Document createDocument(Document doc) {
        newDocument.setUuid(createUuid());
        return repo.save(newDocument);
    }

    @Override
    public UUID createUuid (){
        UUID uuid = UUID.randomUUID();
        System.out.println("============= UUID = " + uuid);
        return uuid;
    }

    @Override
    public Document getDocumentById(UUID id) throws Exception {
        newDocument = repo.findById(id);
        if (newDocument != null) {
            return newDocument;
        } else {
            throw new Exception("id not found");
        }
    }

    @Override
    public Document updateDocumentById(UUID id) {
        return null;
    }

    @Override
    public List<Document> getAllDocuments() {
        return repo.findAll();
    }

}
