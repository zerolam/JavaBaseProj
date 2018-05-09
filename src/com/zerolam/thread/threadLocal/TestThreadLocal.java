package com.zerolam.thread.threadLocal;

import java.util.Random;

/**
 * ThreadLocal ��ʹ�ð���
 * ThreadLocal �����ã�����ʵ���߳��ڵ����ݹ�����������ͬ�ĳ�����룬���ģ����ͬһ���߳�������ʱҪ����һ�����ݣ����������߳�������ʱ�ֹ�������һ�����ݡ�
 * ThreadLocal ��ԭ��
 * 		���ݵ�ǰ�̻߳�ȡ��ǰ�̵߳�ThreadLocalMap ����Ȼ������� map �в���һ����¼��key ��ʵ�� ThreadLocal ����value �Ǹ��Ե� set��������ȥ��ֵ��
 * 		Ҳ����ÿ���߳���ʵ����һ���Լ������ ThreadLocalMap���󣬸ö���� Key �� ThreadLocal����ֵ���û����õľ���ֵ��
 * @author Administrator
 *
 */
public class TestThreadLocal implements Runnable{
	
	@Override
	public void run() {
		writeInfo();
	}
	
	// ��̬�����������߳��ǹ����
	private static ThreadLocal<Student> threadLocal = new ThreadLocal<>();
	private static int count = 0;
	private String[] nameArray = { "zero", "Bob", "Mary", "Mi", "Marks", "James", "Harden", "Garden" };

	public void writeInfo() {
		System.out.println("��ǰcountֵ��" + count);
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
		System.out.println("��ǰcountֵ��" + count);
		System.out.println(threadName + " is writting student = " + stu.toString() + " again.");
	}
	
	/**
	 * ��ȡ��Ϣ
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
	 * ��ȡ��Ϣ
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
		return "ѧ�� " + name + ",���� " + age + "��]";
	}

}