package com.springcore.lifecycle;

public class Animal {
	
	private int id;
	private String name;
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Setting id");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setting name");
		this.name = name;
	}
	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + "]";
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	
	

}
