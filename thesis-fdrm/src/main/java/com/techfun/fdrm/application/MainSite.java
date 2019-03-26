package com.techfun.fdrm.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.fdrm.model.Site;
import com.techfun.fdrm.service.SiteService;

public class MainSite {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		SiteService siteService = appContext.getBean("siteService", SiteService.class);
		
		//testCreateSite(siteService);
		//testUpdateSite(siteService);
		//testSelectSite(siteService);
		//testDeleteSite(siteService);
	}

	private static void testCreateSite(SiteService siteService) {
		Site site = new Site();
		site.setName("Site 3");
		
		siteService.createSite(site);
		
		System.out.println("Site Inserted Successfully.");
	}
	
	private static void testUpdateSite(SiteService siteService) {
		Site site = new Site();
		site.setName("Site 1");
		site.setId(1);
		
		siteService.updateSite(site);
		
		System.out.println("Site Update Successfully.");
	}

	private static void testSelectSite(SiteService siteService) {
		
	}


	private static void testDeleteSite(SiteService siteService) {
		
	}

}
