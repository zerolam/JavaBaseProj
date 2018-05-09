package com.zerolam.inter.impl;

import com.zerolam.inter.Animal;

public class Cat implements Animal{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "My name is cat";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "i am cat,eatting";
	}
	
	public void catShout(){
		System.out.println("cat shouting");
	}

}
