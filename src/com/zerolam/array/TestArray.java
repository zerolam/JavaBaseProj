package com.zerolam.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ���������ķ�������������ظ� value �ĸ����������¸��������
 * 1 ���֣�1 ��
 * 3 ���֣�2 ��
 * 8 ���֣�3 ��
 * 2 ���֣�4 ��
 * int[] arr = {1,4,1,4,2,5,4,5,8,7,8,77,88,5,4,9,6,2,4,1,5};
 * 
 * ����һ��������ֵ��Χ������һ�����ȵ����飬����ͳ�Ƶ�������ֵ��Ϊ�����±꣬����ִ���Ϊֵ��ͨ��ѭ�������ۼ�
 * ��������ʹ��Map��������ͳ�Ƶ�������ֵ��Ϊkey������ִ���Ϊֵ��ͨ��ѭ�������ۼ�
 * @author zerolam
 *
 */
public class TestArray {
	
	public static void main(String[] args) {
		int[] arr = {1,4,1,4,2,5,4,5,8,7,8,77,88,5,4,9,6,2,4,1,5};
		countArray1(arr);
	}
	
	/**
	 * ����һ��������ֵ��Χ������һ�����ȵ����飬����ͳ�Ƶ�������ֵ��Ϊ�����±꣬����ִ���Ϊֵ��ͨ��ѭ�������ۼ�
	 * @param array
	 */
	public static void countArray1(int[] array){
		int[] temp = new int[100];
		for(int i=0;i<array.length;i++){
			temp[array[i]]++;
		}
		try {
			showResult(temp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ��������ʹ��Map��������ͳ�Ƶ�������ֵ��Ϊkey������ִ���Ϊֵ��ͨ��ѭ�������ۼ�
	 * @param array
	 */
	public static void countArray2(int[] array){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		if(array==null){
			System.out.println("��������Ϊ�գ��޷�����");
		}
		for(int a:array){
			if(map.get(a)==null){
				map.put(a, 1);
			}else{
				map.put(a, map.get(a)+1);
			}
		}
		try {
			showResult(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ��ʾ������
	 * @param t
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static void showResult(Object t) throws Exception{
		if(t instanceof Map){
			System.out.println("���������Map����");
			Map<Integer, Integer> temp = (HashMap<Integer, Integer>) t;// ǿתint[]
			Set<Map.Entry<Integer, Integer>> set = temp.entrySet();
			Iterator<Map.Entry<Integer, Integer>> itr = set.iterator();
			while(itr.hasNext()){
				Entry<Integer, Integer> entry = (Entry<Integer, Integer>) itr.next();
				System.out.println((entry.getKey())+"���֣�"+entry.getValue()+"��");
			}
		}else if(t instanceof int[]){
			System.out.println("���������int[]��������");
			int[] temp = (int[]) t;// ǿתint[]
			for(int i=0;i<temp.length;i++){
				if(temp[i]!=0){
					System.out.println((i)+"���֣�"+temp[i]+"��");
				}
			}
		}else{
			throw new Exception("δ֪����");
		}
	}
	
	/**
	 * ����������
	 * @param array
	 */
	public static void sortArray(int[] array){
		Arrays.sort(array);// ����������
		for(int a:array){
			System.out.println(a);
		}
	}
}
