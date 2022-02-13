package com.task.model;

import javax.persistence.*;
import java.util.UUID;

@Table (name = "documents")
@Entity
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private Long id;

    @Column(name = "uuid")
    private UUID uuid;

    @Column(unique = true, name = "document_url")
    private String document;

    public Document() {}

    public Document(UUID uuid, String document) {
        this.uuid = uuid;
        this.document = document;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getDocument() {
        return document;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
