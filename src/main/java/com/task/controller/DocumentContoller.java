package com.task.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentContoller {
    @GetMapping("/")
    public String getId (String id) {
        return "get your ID here";
    };
    @PostMapping("/")
    public String createID(String input) {
        return "store the document here"; }

    @PutMapping("/")
    public  String updateById(String input) {
        return "Update the document here"; }

}
