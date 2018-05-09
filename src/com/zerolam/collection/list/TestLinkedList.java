package com.zerolam.collection.list;

import java.util.LinkedList;

/**
 * LinkedList
 * List 的实现类之一
 * 基于链表实现，链表内存是散乱的，每一个元素存储本身内存地址的同时，还存储下一个元素的地址。
 * 链表增删快，查找慢；
 * @author Administrator
 */
public class TestLinkedList {
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("123");
		list.add("456");
		list.add("789");
		System.out.println(list);
	}
}
