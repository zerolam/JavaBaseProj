package com.zerolam.collection.list;

import java.util.Vector;

/**
 * Vector
 * List ��ʵ����֮һ
 * ��������ʵ�֣��̰߳�ȫ�ģ�Ч�ʵ�
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
