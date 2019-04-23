package com.techfun.fdrm_web.service;

import java.util.List;

import com.techfun.fdrm_web.model.TimePeriod;

public interface TimePeriodService {
	
	void insertTimePeriod(TimePeriod timePeriod);
	
	List<TimePeriod> selectAllTimePeriod(TimePeriod timePeriod);
	
	TimePeriod selectExactTimePeriod(TimePeriod timePeriod);

}
