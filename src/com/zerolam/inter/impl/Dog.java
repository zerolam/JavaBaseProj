package com.zerolam.inter.impl;

import com.zerolam.inter.Animal;

public class Dog implements Animal{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "My name is dog";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "i am dog, eatting";
	}
	
	public void shout(){
		System.out.println("i am dog, shouting");
	}

}
