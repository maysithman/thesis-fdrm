package com.techfun.fdrm.service;

import com.techfun.fdrm.model.Site;

public interface SiteService {

	void createSite (Site site);
	void updateSite (Site site);
	void selectSite (Site site);
	void deleteSite (Site site);
	
}
