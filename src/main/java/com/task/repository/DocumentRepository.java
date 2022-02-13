package com.task.repository;

import com.task.model.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface DocumentRepository extends CrudRepository<Document, UUID> {

}
