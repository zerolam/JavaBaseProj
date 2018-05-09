package com.zerolam.serializable;

import java.io.Serializable;

public class Teacher implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1792093606602052843L;
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
	}
	
	
}
