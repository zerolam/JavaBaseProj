package com.zerolam.collection.set;

import java.util.LinkedHashSet;
/**
 * LinkedHashSet
 * 保存数据插入时的顺序
 * 继承与 HashSet，同时又基于 LinkedHashMap 来进行实现
 * @author Administrator
 *
 */
public class TestLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("345");
		set.add("123");
		set.add("234");
		System.out.println(set);
	}
	
}
