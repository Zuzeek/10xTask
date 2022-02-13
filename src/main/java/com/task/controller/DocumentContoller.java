package com.task.controller;

import com.task.model.Document;
import com.task.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class DocumentContoller {
    DocumentService docService;

    @GetMapping("/docs")
    public List<Document> getAllDocs () {
        return docService.getAllDocuments();
    }

    @GetMapping(value = "id/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Document getDocByUuid (@PathVariable(value = "id") UUID id) throws Exception {
        return docService.getDocumentById(id);
    }

    @PostMapping(value = "/id")
    public UUID createId () {
         UUID uuid = docService.createUuid();
         return uuid;
    }

    @PutMapping(value = "/updateDoc",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public  String updateById(String input) {
        //TODO find the doc based on uuid and update
        return "Update the document here";
    }

}
