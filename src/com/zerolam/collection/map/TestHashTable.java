package com.zerolam.collection.map;

import java.util.Hashtable;
import java.util.Map;

/**
 * HashTable
 * 线程安全，低效，不支持 null 值和 null 键
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
