package com.task.controller;

import com.task.model.Document;
import com.task.repository.DocumentRepository;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.MediaType;

import java.util.List;
import java.util.UUID;

@RestController
public class DocumentContoller {
    DocumentRepository repo;

    @GetMapping("/docs")
    public List<Document> getAllDocs () {
        return (List<Document>) repo.findAll();
    }

    @GetMapping(path = "id/{id}")
    public Document getDocByUuid (@PathVariable(value = "id") UUID id) throws Exception {
        return repo.findById(id).orElseThrow(() -> new Exception("id not found"));
    }

    @PostMapping(path = "/id",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public UUID createId (@RequestBody String inputId) {
         Document doc = new Document();

         UUID uuid = UUID.randomUUID();
         System.out.println("============= UUID = " + uuid);
         doc.setUuid(uuid);
         doc.setDocument("test");

         repo.save(doc);
         return uuid;
    }

    @PutMapping("/updateDoc")
    public  String updateById(String input) {
        //TODO find the doc based on uuid and update
        return "Update the document here";
    }

}
