package com.task.controller;

import com.task.repository.DocumentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


import java.sql.DriverManager;
import java.sql.Statement;
import java.util.UUID;

@RestController
public class DocumentContoller {
    @PostMapping("/getDetails")
    public String getId (String id) {
        //place a post request with uuid and find a doc in the database and return it
        return "get your document here";
    };
    @PostMapping("/createID")
    public UUID createID(String input) {
         UUID uuid=UUID.randomUUID();
        DocumentRepository.save
         //TODO store the value in the database
         return uuid;

    }

    @PutMapping("/updateDoc")
    public  String updateById(String input) {
        //TODO find the doc based on uuid and update
        return "Update the document here"; }

}
