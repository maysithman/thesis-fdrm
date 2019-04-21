package com.techfun.fdrm.repository;

import java.util.List;

import com.techfun.fdrm.model.TimePeriod;

public interface TimePeriodRepository {

	void insertTimePeriod(TimePeriod timePeriod);
	
	List<TimePeriod> selectAllTimePeriod(TimePeriod timePeriod);
	
	TimePeriod selectExactTimePeriod(TimePeriod timePeriod);
	
}
