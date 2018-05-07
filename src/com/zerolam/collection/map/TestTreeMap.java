package com.zerolam.collection.map;

import java.util.TreeMap;
/**
 * TreeMap
 * 能够把它保存的记录根据键排序，默认是键值的升序排序
 * @author Administrator
 *
 */
public class TestTreeMap {
	
	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>();
		map.put("3", "345");
		map.put("4", "456");
		map.put("1", "123");
		map.put("2", "234");
		System.out.println(map);
	}

}
