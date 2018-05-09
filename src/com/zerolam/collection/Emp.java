package com.zerolam.collection;

/**
 * 用于TestTreeSet的排序程序
 * @author Administrator
 *
 */
public class Emp {
	private String name;
	private int age;
	
	public Emp(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
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
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + "]";
	}
}
