package com.techfun.fdrm.repository;

import com.techfun.fdrm.model.Site;

public interface SiteRepository {
	
	void createSite(Site site);
	void updateSite(Site site);
	void selectSite(Site site);
	void deleteSite(Site site);

}
