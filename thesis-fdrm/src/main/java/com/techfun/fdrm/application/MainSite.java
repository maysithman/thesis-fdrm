package com.techfun.fdrm.application;

import java.util.List;

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
		//testSelectAllSites(siteService);
		//testDeleteSite(siteService);
		//testNumOfSite(siteService);
		testSelectExactSite(siteService);
		
	}

	private static void testSelectExactSite(SiteService siteService) {
		Site site = new Site();
		site.setId(2);
		
		Site s = siteService.selectExactSite(site);
		
		System.out.println(
				"Id : " + s.getId() + "		" +
				"Name : " + s.getName()
				);
		
		System.out.println("Selected Exact Site is  Sucessfully.");
	}

	private static void testNumOfSite(SiteService siteService) {
		Site site = new Site();
		System.out.println("The total number of sites : " + siteService.numOfSite(site));
	}

	private static void testSelectAllSites(SiteService siteService) {
		Site site = new Site();
		List<Site> sites = siteService.selectAllSites(site);
		
		for(Site s : sites) {
			System.out.println(
					"ID : " + s.getId() + "		" +
					"Name : " + s.getName()
					);
		}
		
		System.out.println("Selected All Sites Successfully.");
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

	private static void testDeleteSite(SiteService siteService) {
		
	}

}
