package com.zerolam.java_api;

public class MathTest {
	
	public static void main(String[] args) {
		/*
		 * Math.round ��������
		 * ����
		 * 	�������� ���������������룻��������ʱ��С���������պõ���5ʱҲ����ȥ
		 * ԭ��
		 * 	���������ԭ�����ڲ����ϼ� 0.5��Ȼ�����ȡ��
		 */
		System.out.println(Math.round(11.4));
		System.out.println(Math.round(11.5));
		System.out.println(Math.round(-11.4));
		System.out.println(Math.round(-11.5));// ���Ϊ -11
		System.out.println(Math.round(-11.5001));// ���Ϊ -12
		System.out.println(Math.round(-11.6));
	}

}
