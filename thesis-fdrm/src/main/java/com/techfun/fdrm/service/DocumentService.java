package com.techfun.fdrm.service;

import com.techfun.fdrm.model.Document;

public interface DocumentService {

	void createDocument(Document document);
	void updateDocument(Document document);
	void selectDocument(Document document);
	void deleteDocument(Document document);
	
}
