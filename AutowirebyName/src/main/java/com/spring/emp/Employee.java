package com.spring.emp;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.spring.address.Address;

@Component("emp")
public class Employee {
	@Resource(name="address")
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
