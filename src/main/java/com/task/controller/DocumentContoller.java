package com.task.controller;

import com.task.model.Document;
import com.task.repository.DocumentRepository;
import com.task.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.UUID;

@RestController
public class DocumentContoller {
    @Autowired
    private DocumentService documentService;

    @GetMapping("/getDetails")
    public List<Document> getAllDocuments(){
        return documentService.getAllDocuments();
    };
    //place a post request with uuid and find a doc in the database and return it


    DocumentRepository repository;
    @PostMapping("/createID")
        public UUID createID(String input) {

         UUID uuid=UUID.randomUUID();

//        repository.save(new Document(uuid, ""));
         return uuid;

    }

    @PutMapping("/updateDoc")
    public  String updateById(String input) {
        //TODO find the doc based on uuid and update
        return "Update the document here"; }

}
