package com.techfun.fdrm_web.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techfun.fdrm_web.model.Document;
import com.techfun.fdrm_web.repository.util.DocumentRowMapper;

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
	public void deleteDocument(Document document) {
		String deleteDocument = "DELETE FROM Document WHERE id=?";
		jdbcTemplate.update(deleteDocument, document.getId());
	}

	@Override
	public List<Document> selectAllDocuments(Document document) {
		String selectDocSQL = "SELECT * FROM Document";
		return jdbcTemplate.query(selectDocSQL, new DocumentRowMapper());
	}

	@Override
	public Document selectExactDocument(Document document) {
		String selectDocIdSQL = "SELECT * FROM Document WHERE id=?";
		return jdbcTemplate.queryForObject(selectDocIdSQL, new DocumentRowMapper(), document.getId());
	}

	@Override
	public int numOfDoument(Document document) {
		String countDocumentSQL = "SELECT COUNT(*) FROM Document";
		return jdbcTemplate.queryForObject(countDocumentSQL, Integer.class);
	}

}
