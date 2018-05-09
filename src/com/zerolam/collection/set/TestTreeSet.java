package com.zerolam.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

import com.zerolam.collection.Emp;
/**
 * 测试TreeSet的自定义排序
 * @author Administrator
 *
 */
public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet<Emp> set = new TreeSet<>(new MyComparator());
		set.add(new Emp("alan",25));
		set.add(new Emp("zerolam",24));
		set.add(new Emp("blue",29));
		for(Emp e:set){
			System.out.println(e);
		}
	}
}

/**
 * 按年龄正序排列（升序排列）
 * @author Administrator
 * 
 */
class MyComparator implements Comparator<Emp>{
	@Override
	public int compare(Emp o1, Emp o2) {
		if(o1.getAge() < o2.getAge()) {
			return -1;
		}else if(o1.getAge() > o2.getAge()){
			return 1;
		}
		return 0;
	}
}
