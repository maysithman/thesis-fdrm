package com.techfun.fdrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfun.fdrm.model.TimePeriod;
import com.techfun.fdrm.repository.TimePeriodRepository;

@Service("timePeriodService")
public class TimePeriodServiceImpl implements TimePeriodService {
	
	@Autowired
	private TimePeriodRepository timePeriodRepository;

	@Override
	public void insertTimePeriod(TimePeriod timePeriod) {
		timePeriodRepository.insertTimePeriod(timePeriod);
	}

	@Override
	public List<TimePeriod> selectAllTimePeriod(TimePeriod timePeriod) {
		return timePeriodRepository.selectAllTimePeriod(timePeriod);
	}

	@Override
	public TimePeriod selectExactTimePeriod(TimePeriod timePeriod) {
		return timePeriodRepository.selectExactTimePeriod(timePeriod);
	}

}
