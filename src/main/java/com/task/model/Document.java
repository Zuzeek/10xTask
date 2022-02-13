package com.task.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.UUID;

@Table (name = "Documents")
@Entity
//@EntityListeners(AuditingEntityListener.class)
public class Document {
<<<<<<< HEAD


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
=======
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
>>>>>>> ag
    @Column(unique = true)
    private UUID uuid;
    @Column(unique = true)
    private String document;

    public Document() {}

    public Document(UUID uuid, String document) {
        this.uuid = uuid;
        this.document = document;
    }

<<<<<<< HEAD
    public Long getId() {
        return id;
    }
=======
>>>>>>> ag
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
