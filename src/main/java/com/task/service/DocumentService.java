//package com.task.service;
//
//import com.task.model.Document;
//import com.task.repository.DocumentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//import java.util.UUID;
//
//@Service
//public class DocumentService implements IDocumentService {
//
//    @Autowired
//    private DocumentRepository documentRepository;
//
//    @Override
//    public Optional<Document> findById(UUID uuid) {
//        return documentRepository.findById(uuid);
//    }
//}
