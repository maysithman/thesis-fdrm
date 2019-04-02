package com.techfun.fdrm.repository;

import java.util.List;

import com.techfun.fdrm.model.Site;

public interface SiteRepository {
	
	void createSite(Site site);
	
	void updateSite(Site site);
	
	List<Site> selectAllSites(Site site);
	
	void deleteSite(Site site);
	
	int numOfSite(Site site);
	
	Site selectExactSite(Site site);

}
