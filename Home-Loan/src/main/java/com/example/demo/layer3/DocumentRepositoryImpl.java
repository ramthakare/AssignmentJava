package com.example.demo.layer3;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Document;
@Repository
public class DocumentRepositoryImpl extends BaseRepository implements DocumentRepository {

	@Transactional
	public void insertDocument(Document Dobj) 
	{
		super.persist(Dobj);
		System.out.println("Document Inserted");
		
	}

}
