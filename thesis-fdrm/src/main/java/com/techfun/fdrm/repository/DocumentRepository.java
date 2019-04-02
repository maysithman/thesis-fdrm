package com.techfun.fdrm.repository;

import java.util.List;

import com.techfun.fdrm.model.Document;

public interface DocumentRepository {
	
	void createDocument(Document document);
	
	void updateDocument(Document document);
	
	List<Document> selectAllDocuments(Document document);
	
	void deleteDocument(Document document);
	
	Document selectExactDocument(Document document);
	
	int numOfDoument (Document document);

}
