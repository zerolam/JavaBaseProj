package com.zerolam.date;

import java.time.LocalDateTime;
import java.util.Calendar;

public class DateTest {
	
	public static void main(String[] args) {
		testCalendar();
		testLocalDateTime();
	}

	/**
	 * ʹ��Calendar��ȡʱ��
	 */
	public static void testCalendar(){
		System.out.println("===ʹ��Calendar===");
		Calendar cal = Calendar.getInstance();
		System.out.println("�꣺"+cal.get(Calendar.YEAR));
		System.out.println("�£�"+(cal.get(Calendar.MONTH)+1));// Calendar.MONTH��Χ��0-11
		System.out.println("�գ�"+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("ʱ��"+cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("�֣�"+cal.get(Calendar.MINUTE));
		System.out.println("�룺"+cal.get(Calendar.SECOND));
	}
	
	/**
	 * ʹ��Calendar��ȡʱ��
	 */
	public static void testLocalDateTime(){
		System.out.println("===ʹ��LocalDateTime===");
		LocalDateTime cal = LocalDateTime.now();
		System.out.println("�꣺"+cal.getYear());
		System.out.println("�£�"+cal.getMonthValue());// getMonth() ��Χ��1-12
		System.out.println("�գ�"+cal.getDayOfMonth());
		System.out.println("ʱ��"+cal.getHour());
		System.out.println("�֣�"+cal.getMinute());
		System.out.println("�룺"+cal.getSecond());
	}
}
