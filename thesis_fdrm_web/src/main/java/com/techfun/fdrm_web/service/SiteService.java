package com.techfun.fdrm_web.service;

import java.util.List;

import com.techfun.fdrm_web.model.Site;

public interface SiteService {

	void createSite (Site site);
	
	void updateSite (Site site);
	
	List<Site> selectAllSites (Site site);
	
	void deleteSite (Site site);
	
	int numOfSite(Site site);
	
	Site selectExactSite (Site site);
	
}
