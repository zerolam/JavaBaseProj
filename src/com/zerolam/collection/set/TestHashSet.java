package com.zerolam.collection.set;

import java.util.HashSet;
/**
 * HashSet
 * �洢������������ģ��Ҳ��������ظ�����Ԫ���ڼ����е�λ����Ԫ�ص� hashcode ������λ���ǹ̶���
 * �ײ����� HashMap ʵ�֣�ʹ�ø÷�ʽʱ��Ҫ��д equals()�� hashCode()����
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
