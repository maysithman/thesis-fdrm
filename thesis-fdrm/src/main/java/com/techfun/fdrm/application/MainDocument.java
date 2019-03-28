package com.techfun.fdrm.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.fdrm.model.Document;
import com.techfun.fdrm.service.DocumentService;

public class MainDocument {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		DocumentService documentService = appContext.getBean("documentService", DocumentService.class);
		
		//createDcoument(documentService);
		updateDcoument(documentService);
		//selectDocument(documentService);
		//deleteDocument(documentService);
	}

	private static void createDcoument(DocumentService documentService) {
		Document document = new Document();
		document.setName("Computer 5");
		document.setLocation("lllllllllllllll");
		document.setSiteId(3);
		
		documentService.createDocument(document);
		System.out.println("Inserted Document Successfully.");
	}

	private static void updateDcoument(DocumentService documentService) {
		Document document = new Document();
		document.setName("Computer Science 5");
		document.setId(15);
		
		documentService.updateDocument(document);
		System.out.println("Updated Document Successfully.");
	}

	private static void selectDocument(DocumentService documentService) {
		
	}

	private static void deleteDocument(DocumentService documentService) {
		
	}

}
