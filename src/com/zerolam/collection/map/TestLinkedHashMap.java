package com.zerolam.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap
 * HashMap 的一个子类，继承了HashMap的特性，另外保存了记录的插入顺序
 * HashMap 的特性：基于 hash 表的 Map 接口实现，非线程安全，高效，支持 null 值和 null键
 * @author Administrator
 *
 */
public class TestLinkedHashMap {
	
	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();
		map.put("1", "123");
		map.put("2", "456");
		map.put("3", "789");
		map.put(null, null);
		System.out.println(map);
	}

}
