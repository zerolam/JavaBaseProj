package com.zerolam.map.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 已知一个 HashMap<Integer，User>集合， User 有 name（String）和 age（int）属性。
 * 请写一个方法实现对HashMap 的排序功能，该方法接收 HashMap<Integer，User>为形参，返回类型为
 * HashMap<Integer，User>， 要求对 HashMap 中的 User 的 age 倒序进行排序。
 * 排序时 key=value键值对不得拆散。
 * 
 * @author zerolam
 */
public class HashMapSort {
	public static void main(String[] args) {
		HashMap<Integer, User> map = new HashMap<>();
		map.put(1, new User("zero", 25));
		map.put(4, new User("zerolam", 18));
		map.put(3, new User("bob", 30));
		map.put(2, new User("mary", 45));
		System.out.println(map);
		
		HashMap<Integer, User> retMap = sort(map);
		System.out.println(retMap);
	}

	/**
	 * 对 HashMap 中的 User 的 age 倒序进行排序，排序时 key=value键值对不得拆散
	 * @param map
	 * @return
	 */
	private static HashMap<Integer, User> sort(HashMap<Integer, User> map) {
		HashMap<Integer, User> retMap = new LinkedHashMap<>();
		Set<Map.Entry<Integer, User>> entry = map.entrySet();
		List<Map.Entry<Integer, User>> sortList = new ArrayList<>();
		Iterator<Map.Entry<Integer, User>> iter = entry.iterator();
		while (iter.hasNext()) {
			Map.Entry<Integer, User> item = iter.next();
			sortList.add(item);
		}
		// 倒序排列
		Collections.sort(sortList, new Comparator<Map.Entry<Integer, User>>() {
			public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
				if (o1.getValue().getAge() > o2.getValue().getAge()) {
					return -1;
				} else if (o1.getValue().getAge() < o2.getValue().getAge()) {
					return 1;
				} else {
					return 0;
				}
			};
		});
		for(Map.Entry<Integer, User> entity : sortList){
			retMap.put(entity.getKey(), entity.getValue());
		}
		return retMap;
	}
}

class User {
	private String name;
	private int age;

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
