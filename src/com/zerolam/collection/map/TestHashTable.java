package com.zerolam.collection.map;

import java.util.Hashtable;
import java.util.Map;

/**
 * HashTable
 * �̰߳�ȫ����Ч����֧�� null ֵ�� null ��
 * @author Administrator
 *
 */
public class TestHashTable {
	
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>();
		map.put("1", "123");
		map.put("2", "456");
		map.put("3", "789");
		//map.put("4", null);
		//map.put(null, "101");
		//map.put(null, null);
		System.out.println(map);
	}

}
