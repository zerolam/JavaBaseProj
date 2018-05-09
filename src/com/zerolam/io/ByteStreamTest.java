package com.zerolam.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流 
 * 字节流可以处理所有类型数据，如：图片，MP3，AVI 视频文件
 * 
 * @author Administrator
 *
 */
public class ByteStreamTest {

	public static void main(String[] args) {
		String curPath = System.getProperty("user.dir");
		try {
			copyFile(curPath, curPath + File.separator + "img", "重构_改善既有代码的设计[高清版].pdf");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void copyFile(String srcPath, String descPath, String fileName) throws IOException {
		File srcfile = new File(srcPath + File.separator + fileName);
		File descfile = new File(descPath + File.separator + fileName);
		if (!srcfile.exists()) {
			System.out.println("没有找到对应的文件！");
			return;
		}
		if (!descfile.exists()) {
			descfile.createNewFile();
		}
		FileInputStream fileInputStream = new FileInputStream(srcfile);
		FileOutputStream fileOutputStream = new FileOutputStream(descfile);
		byte[] temp = new byte[1024];
		while (fileInputStream.read(temp, 0, temp.length) != -1) {
			// 写出去
			fileOutputStream.write(temp, 0, temp.length);
			fileOutputStream.flush();
		}
		fileInputStream.close();
		fileOutputStream.close();
	}

	/*public static void readFile(String fileName) throws IOException {
		File file = new File(fileName);
		if (file.exists()) {
			FileInputStream fileInputStream = new FileInputStream(file);
			char[] temp = new char[1024];

			fileInputStream.close();
		}
	}

	public static void writeToFile(String fileName) throws IOException {
		File file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileOutputStream outputStream = new FileOutputStream(file);
		long begin = Calendar.getInstance().getTimeInMillis();
		outputStream.w
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.println("写入文件总共耗时：" + (end - begin) + "ms");
		outputStream.close();
	}*/

}
