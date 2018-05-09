package com.zerolam.serializable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 通过对对象序列化和反序列化，实现对象克隆
 * 
 * @author Administrator
 *
 */
public class Student implements Serializable {
	
	private static final long serialVersionUID = 385984406808495533L;
	
	/**
	 * 读取对象，写入输入流，通过输入流读取对象返回 实现对象深克隆
	 * 
	 * @param stu
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Student cloneBySerializable(Student stu) throws IOException, ClassNotFoundException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(stu);
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bais);
		Student obj = (Student) ois.readObject();
		return obj;
	}

	/**
	 * 更加完美的，序列化克隆对象的写法
	 * 可以抽出来做工具类方法
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Serializable> T clone(T obj) throws Exception {
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bout);
		oos.writeObject(obj);
		ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bin);
		return (T) ois.readObject();
		// 说明：调用 ByteArrayInputStream 或 ByteArrayOutputStream 对象的 close 方法没有任何意义
		// 这两个基于内存的流只要垃圾回收器清理对象就能够释放资源，这一点不同于对外部资源（如文件流）的释放
	}

	public static void main(String[] args) {
		Teacher tea = new Teacher("alan", 40);
		Student stu = new Student("zerolam", 25, tea);
		try {
			Student cpyStu = stu.cloneBySerializable(stu);
			stu.setAge(23);
			stu.getTeacher().setAge(50);
			cpyStu.setName("zero");
			System.out.println(stu);
			System.out.println(cpyStu);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
	

	private String name;
	private int age;
	private Teacher teacher;

	public Student(String name, int age, Teacher teacher) {
		super();
		this.name = name;
		this.age = age;
		this.teacher = teacher;
	}

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

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", teacher=" + teacher + "]";
	}

	
}
