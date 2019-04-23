package com.techfun.fdrm_web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfun.fdrm_web.model.Document;
import com.techfun.fdrm_web.repository.DocumentRepository;

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
	public void deleteDocument(Document document) {
		documentRepository.deleteDocument(document);
	}

	@Override
	public List<Document> selectAllDocuments(Document document) {
		return documentRepository.selectAllDocuments(document);
	}

	@Override
	public Document selectExactDocument(Document document) {
		return documentRepository.selectExactDocument(document);
	}

	@Override
	public int numOfDocument(Document document) {
		return documentRepository.numOfDoument(document);
	}

}
