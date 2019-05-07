package com.saran.marius;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.saran.license.License;

@Component("driver")
public class MariusDriver {
	@Autowired
	private License license;

	@Override
	public String toString() {
		return "MariusDriver [license=" + license + "]";
	}

	public License getLicense() {
		return license;
	}

	public void setLicense(License license) {
		this.license = license;
	}
	
	

}
