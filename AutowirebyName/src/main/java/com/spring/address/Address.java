package com.spring.address;

import org.springframework.stereotype.Component;

@Component("address")
public class Address {
	private String addr = "HighFieldCt";

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Address [addr=" + addr + "]";
	}
	
	
}
