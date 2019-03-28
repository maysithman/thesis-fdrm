package com.techfun.fdrm.repository;

import com.techfun.fdrm.model.Document;

public interface DocumentRepository {
	
	void createDocument(Document document);
	void updateDocument(Document document);
	void selectDocument(Document document);
	void deleteDocument(Document document);

}
