package com.zerolam.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap
 * HashMap ��һ�����࣬�̳���HashMap�����ԣ����Ᵽ���˼�¼�Ĳ���˳��
 * HashMap �����ԣ����� hash ��� Map �ӿ�ʵ�֣����̰߳�ȫ����Ч��֧�� null ֵ�� null��
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
