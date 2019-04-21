package com.techfun.fdrm.model;

import java.sql.Time;
import java.time.LocalTime;

public class TimePeriod {
	
	private Integer id;
	private String name;
	private Integer period;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPeriod() {
		return period;
	}
	public void setPeriod(Integer time) {
		this.period = time;
	}

}
