package com.techfun.fdrm.service;

import java.util.List;

import com.techfun.fdrm.model.Document;

public interface DocumentService {

	void createDocument(Document document);
	
	void updateDocument(Document document);
	
	List<Document> selectAllDocuments(Document document);
	
	void deleteDocument(Document document);
	
	Document selectExactDocument(Document document);
	
	int numOfDocument(Document document);
	
}
