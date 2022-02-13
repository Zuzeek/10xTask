package com.task.controller;

import com.task.model.Document;
import com.task.service.DocumentService;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.MediaType;

import java.util.List;
import java.util.UUID;

@RestController
public class DocumentContoller {
    DocumentService docService;

    @GetMapping("/docs")
    public List<Document> getAllDocs () {
        return docService.getAllDocuments();
    }

    @GetMapping(path = "id/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Document getDocByUuid (@PathVariable(value = "id") UUID id) throws Exception {
        return docService.getDocumentById(id);
    }

    @PostMapping(path = "/id")
    public UUID createId () {
         UUID uuid = docService.createUuid();
         return uuid;
    }

    @PutMapping(path = "/updateDoc",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public  String updateById(String input) {
        //TODO find the doc based on uuid and update
        return "Update the document here";
    }

}
