package com.zerolam.collection.set;

import java.util.LinkedHashSet;
/**
 * LinkedHashSet
 * �������ݲ���ʱ��˳��
 * �̳��� HashSet��ͬʱ�ֻ��� LinkedHashMap ������ʵ��
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
