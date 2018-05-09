package com.zerolam.java_api;

public class SwitchTest {
	/*
	 * switch(exp) �� exp ��ȡֵ���� �����������ͣ�
	 * byte�� char��short��int��ö�����ͣ�java5��ʼ����String(java7��ʼ)
	 * 
	 */
	public static void main(String[] args) {
		testByte();
		testChar();
		testShort();
		testInt();
		testString();
		testEnum();
	}
	
	public static void testByte(){
		byte b = 0x7f;
		switch(b){
		case 0x00:
			System.out.println("byte���ͣ�0x00");
			break;
		case 0x7f:
			System.out.println("byte���ͣ�0x7f");
			break;
		}
	}
	
	public static void testChar(){
		char b = 'a';
		switch(b){
		case 'a':
			System.out.println("char ���ͣ�a");
			break;
		case 'b':
			System.out.println("char ���ͣ�b");
			break;
		}
	}
	
	public static void testShort(){
		short b = 32767;// short �ķ�Χ 0x0000 - 0x7fff, -32768  ��  +32767
		switch(b){
		case 0x7fff:
			System.out.println("short ���ͣ�0x7fff");
			break;
		case 0x0000:
			System.out.println("short ���ͣ�0x0000");
			break;
		}
	}
	
	public static void testInt(){
		int b = 0;// short �ķ�Χ 0x00000000 - 0x7fffffff
		switch(b){
		case 1:
			System.out.println("int ���ͣ�1");
			break;
		case 0x0000:
			System.out.println("int ���ͣ�0");
			break;
		}
	}
	
	public static void testString(){
		String b = "123";// short �ķ�Χ 0x00000000 - 0x7fffffff
		switch(b){
		case "123":
			System.out.println("String ���ͣ�123");
			break;
		case "456":
			System.out.println("String ���ͣ�456");
			break;
		}
	}
	
	public enum Color{red, blue, green}
	public static void testEnum(){
		Color b = Color.red;// short �ķ�Χ 0x00000000 - 0x7fffffff
		switch(b){
		case green:
			System.out.println("enum ���ͣ�green");
			break;
		case red:
			System.out.println("enum ���ͣ�red");
			break;
		case blue:
			System.out.println("enum ���ͣ�blue");
			break;
		}
	}


}
