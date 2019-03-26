package com.techfun.fdrm.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techfun.fdrm.model.Site;

@Repository("siteRepository")
public class SiteRepositoryImpl implements SiteRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void createSite(Site site) {
		String insertTableSQL = "INSERT INTO Site(NAME) VALUES(?)";
		jdbcTemplate.update(insertTableSQL, site.getName());
	}

	@Override
	public void updateSite(Site site) {
		String updateTableSQL = "UPDATE Site SET NAME = ? WHERE ID = ?";
		jdbcTemplate.update(updateTableSQL, site.getName(), site.getId());
	}

	@Override
	public void selectSite(Site site) {
		String updateTableSQL = "SELECT * FROM Site";
	}

	@Override
	public void deleteSite(Site site) {
		String deleteTableSQL = "DELETE FROM Site WHERE id = ?";
		jdbcTemplate.update(deleteTableSQL, site.getId());
	}

}
