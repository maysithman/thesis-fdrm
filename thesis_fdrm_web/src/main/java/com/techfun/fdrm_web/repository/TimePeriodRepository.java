package com.techfun.fdrm_web.repository;

import java.util.List;

import com.techfun.fdrm_web.model.TimePeriod;

public interface TimePeriodRepository {

	void insertTimePeriod(TimePeriod timePeriod);
	
	List<TimePeriod> selectAllTimePeriod(TimePeriod timePeriod);
	
	TimePeriod selectExactTimePeriod(TimePeriod timePeriod);
	
}
