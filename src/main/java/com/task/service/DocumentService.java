package com.task.service;

import com.task.model.Document;
import com.task.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DocumentService implements IDocumentService {


    private DocumentRepository documentRepository;

    UUID uuid=UUID.randomUUID();

    private List<Document> documents = Arrays.asList(

            new Document(uuid, "lalalalala"),
            new Document(uuid, "ahahahahha"),
            new Document(uuid, "hohohohoho")
    );

    public List<Document> getAllDocuments(){
        return documents;
    }

    @Override
    public Optional<Document> findById(UUID uuid) {
        return documentRepository.findById(uuid);
    }
}
