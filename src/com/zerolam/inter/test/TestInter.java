package com.zerolam.inter.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.zerolam.inter.Animal;
import com.zerolam.inter.impl.Cat;
import com.zerolam.inter.impl.Dog;

/**
 * 多态使用案例，以及反射机制的使用
 * @author Administrator
 *
 */
public class TestInter {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Animal animal = new Cat();
		//Animal animal = new Dog();
		// 共同的方法
		System.out.println(animal.eat());
		System.out.println(animal.getName());
		
		// 不同子类特殊的方法
		if(animal instanceof Dog){
			Dog d = (Dog)animal;
			d.shout();
		}else if(animal instanceof Cat){
			Cat c = (Cat)animal;
			c.catShout();
		}
		
		// 使用反射机制，调用不同类的指定方法
		Class<? extends Animal> clazz = animal.getClass();
		if(clazz == Dog.class){
			System.out.println("===dog===");
			Method method = clazz.getDeclaredMethod("shout", new Class[]{});
			method.invoke(animal, new Object[]{});
		}else if(clazz == Cat.class){
			System.out.println("===cat===");
		}
	}

}
