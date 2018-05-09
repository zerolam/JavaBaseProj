package com.zerolam.collection.set;

import java.util.HashSet;
/**
 * HashSet
 * 存储的数据是无序的，且不允许有重复，但元素在集合中的位置由元素的 hashcode 决定，位置是固定的
 * 底层是由 HashMap 实现，使用该方式时需要重写 equals()和 hashCode()方法
 * @author Administrator
 *
 */
public class TestHashSet {
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("345");
		set.add("abv");
		set.add("123");
		set.add("234");
		System.out.println(set);
	}
}
