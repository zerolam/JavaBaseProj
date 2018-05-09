package com.zerolam.java_api;

public class SwitchTest {
	/*
	 * switch(exp) 中 exp 的取值类型 包括以下类型：
	 * byte、 char、short、int、枚举类型（java5开始）、String(java7开始)
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
			System.out.println("byte类型：0x00");
			break;
		case 0x7f:
			System.out.println("byte类型：0x7f");
			break;
		}
	}
	
	public static void testChar(){
		char b = 'a';
		switch(b){
		case 'a':
			System.out.println("char 类型：a");
			break;
		case 'b':
			System.out.println("char 类型：b");
			break;
		}
	}
	
	public static void testShort(){
		short b = 32767;// short 的范围 0x0000 - 0x7fff, -32768  至  +32767
		switch(b){
		case 0x7fff:
			System.out.println("short 类型：0x7fff");
			break;
		case 0x0000:
			System.out.println("short 类型：0x0000");
			break;
		}
	}
	
	public static void testInt(){
		int b = 0;// short 的范围 0x00000000 - 0x7fffffff
		switch(b){
		case 1:
			System.out.println("int 类型：1");
			break;
		case 0x0000:
			System.out.println("int 类型：0");
			break;
		}
	}
	
	public static void testString(){
		String b = "123";// short 的范围 0x00000000 - 0x7fffffff
		switch(b){
		case "123":
			System.out.println("String 类型：123");
			break;
		case "456":
			System.out.println("String 类型：456");
			break;
		}
	}
	
	public enum Color{red, blue, green}
	public static void testEnum(){
		Color b = Color.red;// short 的范围 0x00000000 - 0x7fffffff
		switch(b){
		case green:
			System.out.println("enum 类型：green");
			break;
		case red:
			System.out.println("enum 类型：red");
			break;
		case blue:
			System.out.println("enum 类型：blue");
			break;
		}
	}


}
