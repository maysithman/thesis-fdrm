package com.techfun.fdrm.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techfun.fdrm.model.Document;

@Repository("documentRepository")
public class DocumentRepositoryImpl implements DocumentRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void createDocument(Document document) {
		String insertDocument = "INSERT INTO Document(Name, Location, SiteId) VALUES(?, ?, ?)";
		jdbcTemplate.update(insertDocument, document.getName(), document.getLocation(), document.getSiteId());
	}

	@Override
	public void updateDocument(Document document) {
		String updateDocument = "UPDATE Document SET Name=? WHERE id=?";
		jdbcTemplate.update(updateDocument, document.getName(), document.getId());
	}

	@Override
	public void selectDocument(Document document) {
		String selectDocument = "SELECT * FROM Document WHERE id=?";
		jdbcTemplate.update(selectDocument, document.getId());
	}

	@Override
	public void deleteDocument(Document document) {
		String deleteDocument = "DELETE FROM Document WHERE id=?";
		jdbcTemplate.update(deleteDocument, document.getId());
	}

}
