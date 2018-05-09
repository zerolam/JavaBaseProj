package com.zerolam.string;

public class StringTest {
	
	public static void main(String[] args) {
		String s1 = "Programming";
		String s2 = new String("Programming");
		String s3 = "Program";
		String s4 = "ming";
		String s5 = "Program" + "ming";
		String s6 = s3 + s4;
		System.out.println(s1 == s2); //false
		System.out.println(s1 == s5); //true，编译器在编译时直接进行优化，将s5编译成 Programming
		System.out.println(s1 == s6); //false，编译器在编译时不能确定s3和s4的赋值的内容，因此s3和s4会在运行时新建对象赋值，因此地址值不同
		System.out.println(s1 == s6.intern()); //true
		System.out.println(s2 == s2.intern()); //false
		
		/*
		 * String.intern() 方法的作用：
		 * 当调用 intern() 方法时，编译器会将字符串添加到常量池中（stringTable维护），并返回指向该常量的引用
		 */
	}
}
