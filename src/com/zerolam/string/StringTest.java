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
		System.out.println(s1 == s5); //true���������ڱ���ʱֱ�ӽ����Ż�����s5����� Programming
		System.out.println(s1 == s6); //false���������ڱ���ʱ����ȷ��s3��s4�ĸ�ֵ�����ݣ����s3��s4��������ʱ�½�����ֵ����˵�ֵַ��ͬ
		System.out.println(s1 == s6.intern()); //true
		System.out.println(s2 == s2.intern()); //false
		
		/*
		 * String.intern() ���������ã�
		 * ������ intern() ����ʱ���������Ὣ�ַ�����ӵ��������У�stringTableά������������ָ��ó���������
		 */
	}
}
