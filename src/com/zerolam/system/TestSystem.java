package com.zerolam.system;

/**
 * 测试System 这个类的功能
 * 
 * @author Administrator
 *
 */
public class TestSystem {

	public static void main(String[] args) {
		/*
		 * 获取系统中常见的属性
		 */
		System.out.println("Java 运行时环境版本: " + System.getProperty("java.version")); 	// Java运行时环境版本
		System.out.println("Java 安装目录: " + System.getProperty("java.home")); 			// Java安装目录
		System.out.println("操作系统的名称: " + System.getProperty("os.name")); 				// 操作系统的名称
		System.out.println("操作系统的版本: " + System.getProperty("os.version")); 			// 操作系统的版本
		System.out.println("用户的账户名称: " + System.getProperty("user.name")); 			// 用户的账户名称
		System.out.println("用户的主目录: " + System.getProperty("user.home")); 			// 用户的主目录
		System.out.println("用户的当前工作目录: " + System.getProperty("user.dir")); 			// 用户的当前工作目录

	}
}
