package com.spring.SpringScope;

public class Emp {
	//Setter Injection
	private int id;
	private String name;
	private String city;
	
	
	public void call() {
		System.out.println("Emp ID"+id+"Emp Name"+name+"Emp City"+city);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
