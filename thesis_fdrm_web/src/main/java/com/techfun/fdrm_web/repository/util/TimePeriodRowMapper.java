package com.techfun.fdrm_web.repository.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.techfun.fdrm_web.model.TimePeriod;

public class TimePeriodRowMapper implements RowMapper<TimePeriod> {

	@Override
	public TimePeriod mapRow(ResultSet rs, int rowNum) throws SQLException {
		TimePeriod timePeriod = new TimePeriod();
		timePeriod.setId(rs.getInt("id"));
		timePeriod.setName(rs.getString("name"));
		timePeriod.setPeriod(rs.getInt("period"));
		return timePeriod;
	}

}
