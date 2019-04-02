package com.techfun.fdrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfun.fdrm.model.Site;
import com.techfun.fdrm.repository.SiteRepository;

@Service("siteService")
public class SiteServiceImpl implements SiteService {
	
	@Autowired
	private SiteRepository siteRepository;

	@Override
	public void createSite(Site site) {
		siteRepository.createSite(site);
	}

	@Override
	public void updateSite(Site site) {
		siteRepository.updateSite(site);
	}

	@Override
	public void deleteSite(Site site) {
		siteRepository.deleteSite(site);
	}

	@Override
	public List<Site> selectAllSites(Site site) {
		return siteRepository.selectAllSites(site);
	}

	@Override
	public int numOfSite(Site site) {
		return siteRepository.numOfSite(site);
	}

	@Override
	public Site selectExactSite(Site site) {
		return siteRepository.selectExactSite(site);
	}

}
