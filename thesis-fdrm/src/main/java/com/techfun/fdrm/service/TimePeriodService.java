package com.techfun.fdrm.service;

import java.util.List;

import com.techfun.fdrm.model.TimePeriod;

public interface TimePeriodService {
	
	void insertTimePeriod(TimePeriod timePeriod);
	
	List<TimePeriod> selectAllTimePeriod(TimePeriod timePeriod);
	
	TimePeriod selectExactTimePeriod(TimePeriod timePeriod);

}
