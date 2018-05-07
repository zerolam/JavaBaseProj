package com.zerolam.collection.list;

import java.util.Vector;

/**
 * Vector
 * List 的实现类之一
 * 基于数组实现，线程安全的，效率低
 * @author Administrator
 *
 */
public class TestVetor {
	
	public static void main(String[] args) {
		Vector<Object> list = new Vector<>();
		list.add(new String("123"));
		list.add(new Integer(456));
		list.add(new Float(78.9));
		System.out.println(list);
	}

}
