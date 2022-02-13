package com.task.controller;

import com.task.model.Document;
import com.task.repository.DocumentRepository;
<<<<<<< HEAD
import com.task.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


=======
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

>>>>>>> ag
import java.util.List;
import java.util.UUID;

@RestController
public class DocumentContoller {
<<<<<<< HEAD
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
=======

    DocumentRepository repo;

    @GetMapping("/docs")
    public List<Document> getAllDocs () {
        //place a post request with uuid and find a doc in the database and return it
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
>>>>>>> ag

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
