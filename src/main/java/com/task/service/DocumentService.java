package com.task.service;

import com.task.model.Document;

import java.util.List;
import java.util.UUID;

public interface DocumentService {
    UUID createUuid ();
    Document createDocument (Document doc);
    Document getDocumentById(UUID id) throws Exception;
    Document updateDocumentById (UUID id);
    List<Document> getAllDocuments();
}
