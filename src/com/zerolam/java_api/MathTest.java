package com.zerolam.java_api;

public class MathTest {
	
	public static void main(String[] args) {
		/*
		 * Math.round 四舍五入
		 * 现象：
		 * 	正浮点数 是正常的四舍五入；负浮点数时，小数点后的数刚好等于5时也是舍去
		 * 原理：
		 * 	四舍五入的原理是在参数上加 0.5，然后进行取整
		 */
		System.out.println(Math.round(11.4));
		System.out.println(Math.round(11.5));
		System.out.println(Math.round(-11.4));
		System.out.println(Math.round(-11.5));// 结果为 -11
		System.out.println(Math.round(-11.5001));// 结果为 -12
		System.out.println(Math.round(-11.6));
	}

}
