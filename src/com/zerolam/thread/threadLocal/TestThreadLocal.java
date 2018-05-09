package com.zerolam.thread.threadLocal;

import java.util.Random;

/**
 * ThreadLocal 的使用案例
 * ThreadLocal 的作用：用于实现线程内的数据共享，即对于相同的程序代码，多个模块在同一个线程中运行时要共享一份数据，而在另外线程中运行时又共享另外一份数据。
 * ThreadLocal 的原理：
 * 		根据当前线程获取当前线程的ThreadLocalMap 对象，然后往这个 map 中插入一条记录，key 其实是 ThreadLocal 对象，value 是各自的 set方法传进去的值。
 * 		也就是每个线程其实都有一份自己独享的 ThreadLocalMap对象，该对象的 Key 是 ThreadLocal对象，值是用户设置的具体值。
 * @author Administrator
 *
 */
public class TestThreadLocal implements Runnable{
	
	@Override
	public void run() {
		writeInfo();
	}
	
	// 静态变量，所有线程是共享的
	private static ThreadLocal<Student> threadLocal = new ThreadLocal<>();
	private static int count = 0;
	private String[] nameArray = { "zero", "Bob", "Mary", "Mi", "Marks", "James", "Harden", "Garden" };

	public void writeInfo() {
		System.out.println("当前count值：" + count);
		count++;
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " is writting info.");
		Student stu = getStudent();
		System.out.println(threadName + " is writting student = " + stu.toString());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("当前count值：" + count);
		System.out.println(threadName + " is writting student = " + stu.toString() + " again.");
	}
	
	/**
	 * 获取信息
	 * 
	 * @return
	 */
	private Student getStudent1() {
		Student s = null;
		if (s == null) {
			Random random = new Random();
			int ranInt = random.nextInt(100);
			int index = ranInt % 8;
			s = new Student(nameArray[index], ranInt);
		}
		return s;
	}

	/**
	 * 获取信息
	 * 
	 * @return
	 */
	private Student getStudent() {
		Student s = (Student) threadLocal.get();
		if (s == null) {
			Random random = new Random();
			int ranInt = random.nextInt(100);
			int index = ranInt % 8;
			s = new Student(nameArray[index], ranInt);
			threadLocal.set(s);
		}
		return s;
	}
	
	public static void main(String[] args) {
		TestThreadLocal t = new TestThreadLocal();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}
}

class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
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

	@Override
	public String toString() {
		return "学生 " + name + ",今年 " + age + "岁]";
	}

}