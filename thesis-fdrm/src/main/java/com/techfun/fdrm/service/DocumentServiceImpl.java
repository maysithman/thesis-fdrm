package com.techfun.fdrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfun.fdrm.model.Document;
import com.techfun.fdrm.repository.DocumentRepository;

@Service("documentService")
public class DocumentServiceImpl implements DocumentService {

	@Autowired
	private DocumentRepository documentRepository;
	
	@Override
	public void createDocument(Document document) {
		documentRepository.createDocument(document);
	}

	@Override
	public void updateDocument(Document document) {
		documentRepository.updateDocument(document);
	}

	@Override
	public void selectDocument(Document document) {
		documentRepository.selectDocument(document);
	}

	@Override
	public void deleteDocument(Document document) {
		documentRepository.deleteDocument(document);
	}

}
