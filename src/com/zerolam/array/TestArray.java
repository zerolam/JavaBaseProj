package com.zerolam.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 用面向对象的方法求出数组中重复 value 的个数，按如下个数输出：
 * 1 出现：1 次
 * 3 出现：2 次
 * 8 出现：3 次
 * 2 出现：4 次
 * int[] arr = {1,4,1,4,2,5,4,5,8,7,8,77,88,5,4,9,6,2,4,1,5};
 * 
 * 方法一：根据数值范围，声明一定长度的数组，将待统计的数组数值作为数组下标，其出现次数为值，通过循环遍历累加
 * 方法二：使用Map处理，将待统计的数组数值作为key，其出现次数为值，通过循环遍历累加
 * @author zerolam
 *
 */
public class TestArray {
	
	public static void main(String[] args) {
		int[] arr = {1,4,1,4,2,5,4,5,8,7,8,77,88,5,4,9,6,2,4,1,5};
		countArray1(arr);
	}
	
	/**
	 * 方法一：根据数值范围，声明一定长度的数组，将待统计的数组数值作为数组下标，其出现次数为值，通过循环遍历累加
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
	 * 方法二：使用Map处理，将待统计的数组数值作为key，其出现次数为值，通过循环遍历累加
	 * @param array
	 */
	public static void countArray2(int[] array){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		if(array==null){
			System.out.println("传入数据为空，无法处理。");
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
	 * 显示排序结果
	 * @param t
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static void showResult(Object t) throws Exception{
		if(t instanceof Map){
			System.out.println("传入参数是Map类型");
			Map<Integer, Integer> temp = (HashMap<Integer, Integer>) t;// 强转int[]
			Set<Map.Entry<Integer, Integer>> set = temp.entrySet();
			Iterator<Map.Entry<Integer, Integer>> itr = set.iterator();
			while(itr.hasNext()){
				Entry<Integer, Integer> entry = (Entry<Integer, Integer>) itr.next();
				System.out.println((entry.getKey())+"出现："+entry.getValue()+"次");
			}
		}else if(t instanceof int[]){
			System.out.println("传入参数是int[]数组类型");
			int[] temp = (int[]) t;// 强转int[]
			for(int i=0;i<temp.length;i++){
				if(temp[i]!=0){
					System.out.println((i)+"出现："+temp[i]+"次");
				}
			}
		}else{
			throw new Exception("未知类型");
		}
	}
	
	/**
	 * 给数组排序
	 * @param array
	 */
	public static void sortArray(int[] array){
		Arrays.sort(array);// 给数组排序
		for(int a:array){
			System.out.println(a);
		}
	}
}
