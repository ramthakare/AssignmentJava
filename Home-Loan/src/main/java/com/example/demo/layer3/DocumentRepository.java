package com.example.demo.layer3;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Document;
@Repository
public interface DocumentRepository
{
  void insertDocument(Document Dobj);
}
