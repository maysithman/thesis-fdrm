package com.techfun.fdrm_web.repository.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.techfun.fdrm_web.model.Document;

public class DocumentRowMapper implements RowMapper<Document> {

	@Override
	public Document mapRow(ResultSet rs, int rowNum) throws SQLException {
		Document document = new Document();
		document.setId(rs.getInt("id"));
		document.setName(rs.getString("name"));
		document.setLocation(rs.getString("location"));
		document.setSiteId(rs.getInt("siteid"));
		return document;
	}

}
