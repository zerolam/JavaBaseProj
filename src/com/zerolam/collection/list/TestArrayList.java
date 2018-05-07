package com.zerolam.collection.list;

import java.util.ArrayList;

/**
 * ArrayList
 * List 的实现类之一
 * 基于数组实现，非线程安全的，效率高，便于索引，但不便于插入删除；
 * @author Administrator
 */
public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("123");
		list.add("456");
		list.add("789");
		System.out.println(list);
	}
}
