package com.task.service;

import com.task.model.Document;

import java.util.Optional;
import java.util.UUID;

public interface IDocumentService {

    Optional<Document> findById(UUID uuid);

}
