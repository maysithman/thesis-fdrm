package com.techfun.fdrm_web.repository.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.techfun.fdrm_web.model.Site;

public class SiteRowMapper implements RowMapper<Site> {

	@Override
	public Site mapRow(ResultSet rs, int rowNum) throws SQLException {
		Site site = new Site();
		site.setId(rs.getInt("id"));
		site.setName(rs.getString("name"));
		return site;
	}

}
