package com.zerolam.inter.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.zerolam.inter.Animal;
import com.zerolam.inter.impl.Cat;
import com.zerolam.inter.impl.Dog;

/**
 * ��̬ʹ�ð������Լ�������Ƶ�ʹ��
 * @author Administrator
 *
 */
public class TestInter {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Animal animal = new Cat();
		//Animal animal = new Dog();
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
		
		// ʹ�÷�����ƣ����ò�ͬ���ָ������
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
