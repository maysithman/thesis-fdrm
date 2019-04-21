package com.techfun.fdrm.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techfun.fdrm.model.TimePeriod;
import com.techfun.fdrm.service.TimePeriodService;

public class AppTimePeriod {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		TimePeriodService timePeriodService = appContext.getBean("timePeriodService", TimePeriodService.class);
		
		testInsertTimePeriod(timePeriodService);
	}

	private static void testInsertTimePeriod(TimePeriodService timePeriodService) {
		TimePeriod timePeriod = new TimePeriod();
		timePeriod.setName("t1");
		timePeriod.setPeriod(6);
		
		timePeriodService.insertTimePeriod(timePeriod);
		System.out.println("Insert Successfully.");
	}

}
