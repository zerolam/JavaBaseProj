package com.zerolam.inter.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.zerolam.inter.Animal;
import com.zerolam.inter.impl.Cat;
import com.zerolam.inter.impl.Dog;

public class TestInter {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Animal animal = new Cat();
		// ��ͬ�ķ���
		System.out.println(animal.eat());
		System.out.println(animal.getName());
		
		// ��ͬ��������ķ���
		if(animal instanceof Dog){
			Dog d = (Dog)animal;
			d.shout();
		}else if(animal instanceof Cat){
			Cat c = (Cat)animal;
			c.catShout();
		}
		
		Class clazz = animal.getClass();
		if(clazz == Dog.class){
			System.out.println("===dog===");
			Method method = clazz.getDeclaredMethod("shout", null);
			method.invoke(animal, null);
		}else if(clazz == Cat.class){
			System.out.println("===cat===");
		}
	}

}
