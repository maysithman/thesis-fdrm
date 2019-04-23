package com.techfun.fdrm_web.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techfun.fdrm_web.model.Site;
import com.techfun.fdrm_web.repository.util.SiteRowMapper;

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
	public void deleteSite(Site site) {
		String deleteTableSQL = "DELETE FROM Site WHERE id = ?";
		jdbcTemplate.update(deleteTableSQL, site.getId());
	}

	@Override
	public List<Site> selectAllSites(Site site) {
		String selectSitesSQL = "SELECT * FROM Site";
		List<Site> sites = jdbcTemplate.query(selectSitesSQL, new SiteRowMapper());
		return sites;
	}

	@Override
	public int numOfSite(Site site) {
		String countSiteSQL = "SELECT COUNT(*) FROM Site";
		return jdbcTemplate.queryForObject(countSiteSQL, Integer.class);
	}

	@Override
	public Site selectExactSite(Site site) {
		String selectSiteIdSQL = "SELECT * FROM Site WHERE id=?";
		Site s = jdbcTemplate.queryForObject(selectSiteIdSQL, new SiteRowMapper(), site.getId());
		return s;
	}

}
