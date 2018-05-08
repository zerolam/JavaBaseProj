package com.zerolam.map.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ThreadSafeHashMap {
	
	public static void main(String[] args) {
		HashMap map = new HashMap<>();
		// 获取线程安全的HashMap的方法
		Map syncMap = Collections.synchronizedMap(map);
		
	}

}
