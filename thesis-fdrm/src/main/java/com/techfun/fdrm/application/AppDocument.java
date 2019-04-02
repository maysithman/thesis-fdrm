package com.techfun.fdrm.application;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.fdrm.model.Document;
import com.techfun.fdrm.service.DocumentService;

public class AppDocument {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		DocumentService documentService = appContext.getBean("documentService", DocumentService.class);
		
		//createDcoument(documentService);
		//updateDcoument(documentService);
		//selectDocument(documentService);
		//deleteDocument(documentService);
		//testSelectAllDocuments(documentService);
		//testSelectExactDocument(documentService);
		testNumOfDocument(documentService);
	}

	private static void testNumOfDocument(DocumentService documentService) {
		Document document = new Document();
		System.out.println("The total numbers of document : " + documentService.numOfDocument(document));
	}

	private static void testSelectExactDocument(DocumentService documentService) {
		Document document = new Document();
		document.setId(4);
		
		Document d = documentService.selectExactDocument(document);
		System.out.println(
						"Id : " + d.getId() + "\t" +
						"Name : " + d.getName() + "\t" +
						"Location : " + d.getLocation() + "\t" +
						"Site Id : " + d.getSiteId()
				);
	}

	private static void testSelectAllDocuments(DocumentService documentService) {
		Document document = new Document();
		List<Document> documents = documentService.selectAllDocuments(document);
		for(Document d : documents) {
			System.out.println(
							"Id : " + d.getId() + "\t" +
							"Name : " + d.getName() + "\t" +
							"Location : " + d.getLocation() + "\t" +
							"Site Id : " + d.getSiteId()
					);
		}
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
