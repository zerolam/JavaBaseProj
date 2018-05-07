package com.zerolam.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 获取线程安全的集合
 * @author Administrator
 *
 */
public class TestSynchronizdCollection {
	
	public static void main(String[] args) {
		// 获取线程安全的 ArrayList
		List<String> unsafeList = new ArrayList<>();
		List<String> safeList = Collections.synchronizedList(unsafeList);
		System.out.println(safeList);
		
		// 获取线程安全的 HashSet
		Set<String> unsafeSet = new HashSet<String>();
		Set<String> safeSet = Collections.synchronizedSet(unsafeSet);
		System.out.println(safeSet);
		
		// 获取线程安全的 HashMap
		Map<String,Object> unsafeMap = new HashMap<>();
		Map<String,Object> safeMap = Collections.synchronizedMap(unsafeMap);
		System.out.println(safeMap);
	}
}
