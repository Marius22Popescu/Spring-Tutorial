package com.saran.license;

import org.springframework.stereotype.Component;

@Component
public class License {
	
	private String number="8CC9999";

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "License [number=" + number + "]";
	}
	
	
	
	

}
