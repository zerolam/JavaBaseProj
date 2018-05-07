package com.zerolam.date;

import java.time.LocalDateTime;
import java.util.Calendar;

public class DateTest {
	
	public static void main(String[] args) {
		testCalendar();
		testLocalDateTime();
	}

	/**
	 * 使用Calendar获取时间
	 */
	public static void testCalendar(){
		System.out.println("===使用Calendar===");
		Calendar cal = Calendar.getInstance();
		System.out.println("年："+cal.get(Calendar.YEAR));
		System.out.println("月："+(cal.get(Calendar.MONTH)+1));// Calendar.MONTH范围：0-11
		System.out.println("日："+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("时："+cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("分："+cal.get(Calendar.MINUTE));
		System.out.println("秒："+cal.get(Calendar.SECOND));
	}
	
	/**
	 * 使用Calendar获取时间
	 */
	public static void testLocalDateTime(){
		System.out.println("===使用LocalDateTime===");
		LocalDateTime cal = LocalDateTime.now();
		System.out.println("年："+cal.getYear());
		System.out.println("月："+cal.getMonthValue());// getMonth() 范围：1-12
		System.out.println("日："+cal.getDayOfMonth());
		System.out.println("时："+cal.getHour());
		System.out.println("分："+cal.getMinute());
		System.out.println("秒："+cal.getSecond());
	}
}
