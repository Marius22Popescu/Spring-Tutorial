package com.spring.SpringCore;

public class Product {
	private int id;
	private String name;
	private int price;
	
	public Product() {System.out.println("zero arg constructor");}
	public Product (int id) {this.id=id;}
	public Product(String name) {this.name=name;}
	public Product(String name, int price) {this.name=name; this.price=price;}
	
	public void display() {
		System.out.println("Product id "+id+"Product name"+name+"Product price"+price);
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
