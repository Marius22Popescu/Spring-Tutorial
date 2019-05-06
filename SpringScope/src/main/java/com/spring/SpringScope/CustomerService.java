package com.spring.SpringScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


//@Service - Indicates that an annotated class is a "Service", originally defined by Domain-Driven Design as "an operation offered 
//as an interface that stands alone in the model, with no encapsulated state."
@Service
@Scope("prototype")
public class CustomerService {
	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
