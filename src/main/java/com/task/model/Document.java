package com.task.model;

import javax.persistence.*;

@Entity
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    @Column(unique = true)
    private Long uuid;
    private String document;


    public Long getUuid() {
        return uuid;
    }

    public String getDocument() {
        return document;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
