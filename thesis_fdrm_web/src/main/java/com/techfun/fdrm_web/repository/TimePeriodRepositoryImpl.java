package com.techfun.fdrm_web.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.techfun.fdrm_web.model.TimePeriod;
import com.techfun.fdrm_web.repository.util.TimePeriodRowMapper;

@Repository("timePeriodRepository")
public class TimePeriodRepositoryImpl implements TimePeriodRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void insertTimePeriod(TimePeriod timePeriod) {
		jdbcTemplate.update("INSERT INTO time_period(name, period) VALUES(?, ?)", timePeriod.getName(), timePeriod.getPeriod());
	}

	@Override
	public List<TimePeriod> selectAllTimePeriod(TimePeriod timePeriod) {
		return jdbcTemplate.query("SELECT * FROM time_period", new TimePeriodRowMapper());
	}

	@Override
	public TimePeriod selectExactTimePeriod(TimePeriod timePeriod) {
		return jdbcTemplate.queryForObject("SELECT * FROM time_period WHERE id=?", new TimePeriodRowMapper(), timePeriod.getId());
	}

}
