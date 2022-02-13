package com.task.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.UUID;

@Table (name = "Documents")
@Entity
//@EntityListeners(AuditingEntityListener.class)
public class Document {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private UUID uuid;
    @Column(unique = true)
    private String document;


    public Document() {
    }

    public Document(UUID uuid, String document) {
        this.uuid = uuid;
        this.document = document;
    }

    public Long getId() {
        return id;
    }
    public UUID getUuid() {
        return uuid;
    }

    public String getDocument() {
        return document;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
