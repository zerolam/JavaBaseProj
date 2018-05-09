package com.zerolam.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Calendar;

/**
 * 字符流 
 * 字符流只能处理字符数据，只要是处理纯文本数据，就要优先考虑使用字符流，除此之外都用字节流
 * 
 * @author Administrator
 *
 */
public class CharStreamTest {

	/**
	 * 写出到文件，再读取文件内容，显示在控制台
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		String curPath = System.getProperty("user.dir");
		String fileName = curPath + File.separator + "test.txt";
		try {
			writeToFile(fileName);
			readFile(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readFile(String fileName) throws IOException {
		File file = new File(fileName);
		if (file.exists()) {
			FileInputStream fileInputStream = new FileInputStream(file);
			InputStreamReader reader = new InputStreamReader(fileInputStream, "UTF-8");// 设置编码
			char[] temp = new char[1024];
			StringBuilder sb = new StringBuilder();
			while (reader.read(temp, 0, temp.length) != -1) {
				System.out.println("读一次");
				sb.append(temp);
			}
			System.out.println(sb.toString());
			reader.close();
			fileInputStream.close();
		}
	}

	public static void writeToFile(String fileName) throws IOException {
		String text = "Good morning! It is really my honor to have this opportunity for an interview, "
				+ "and I hope I can make a good performance today.Good morning!"
				+ "However, although i have the ability to develop a product successfully, "
				+ "i know that it is not enough and i have to continue improving my skill.I hope that "
				+ "i could become a member of HSBC in order to create greater value for company and improve myself."
				+ "and I hope I can make a good performance today.Good morning!"
				+ "However, although i have the ability to develop a product successfully, "
				+ "i know that it is not enough and i have to continue improving my skill.I hope that "
				+ "i could become a member of HSBC in order to create greater value for company and improve myself."
				+ "and I hope I can make a good performance today.Good morning!"
				+ "However, although i have the ability to develop a product successfully, "
				+ "i know that it is not enough and i have to continue improving my skill.I hope that "
				+ "i could become a member of HSBC in order to create greater value for company and improve myself."
				+ "and I hope I can make a good performance today.Good morning!"
				+ "However, although i have the ability to develop a product successfully, "
				+ "i know that it is not enough and i have to continue improving my skill.I hope that "
				+ "i could become a member of HSBC in order to create greater value for company and improve myself."
				+ "and I hope I can make a good performance today.Good morning!"
				+ "However, although i have the ability to develop a product successfully, "
				+ "i know that it is not enough and i have to continue improving my skill.I hope that "
				+ "i could become a member of HSBC in order to create greater value for company and improve myself."
				+ "and I hope I can make a good performance today.Good morning!"
				+ "However, although i have the ability to develop a product successfully, "
				+ "i know that it is not enough and i have to continue improving my skill.I hope that "
				+ "i could become a member of HSBC in order to create greater value for company and improve myself."
				+ "and I hope I can make a good performance today.Good morning!"
				+ "However, although i have the ability to develop a product successfully, "
				+ "i know that it is not enough and i have to continue improving my skill.I hope that "
				+ "i could become a member of HSBC in order to create greater value for company and improve myself."
				+ "and I hope I can make a good performance today.Good morning!"
				+ "However, although i have the ability to develop a product successfully, "
				+ "i know that it is not enough and i have to continue improving my skill.I hope that "
				+ "i could become a member of HSBC in order to create greater value for company and improve myself."
				+ "and I hope I can make a good performance today.Good morning!"
				+ "However, although i have the ability to develop a product successfully, "
				+ "i know that it is not enough and i have to continue improving my skill.I hope that "
				+ "i could become a member of HSBC in order to create greater value for company and improve myself."
				+ "and I hope I can make a good performance today.Good morning!"
				+ "However, although i have the ability to develop a product successfully, "
				+ "i know that it is not enough and i have to continue improving my skill.I hope that "
				+ "i could become a member of HSBC in order to create greater value for company and improve myself."
				+ "and I hope I can make a good performance today.Good morning!"
				+ "However, although i have the ability to develop a product successfully, "
				+ "i know that it is not enough and i have to continue improving my skill.I hope that "
				+ "i could become a member of HSBC in order to create greater value for company and improve myself."
				+ "I am very grateful that HSBC offers the interview opportunity for me.Thank you for your listening.";
		File file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileOutputStream outputStream = new FileOutputStream(file);
		OutputStreamWriter writer = new OutputStreamWriter(outputStream, "UTF-8");
		long begin = Calendar.getInstance().getTimeInMillis();
		System.out.println();
		writer.write(text, 0, text.length());
		writer.flush();
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.println("写入文件总共耗时：" + (end - begin) + "ms");
		writer.close();
		outputStream.close();
	}
}
