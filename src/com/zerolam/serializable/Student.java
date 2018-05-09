package com.zerolam.serializable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * ͨ���Զ������л��ͷ����л���ʵ�ֶ����¡
 * 
 * @author Administrator
 *
 */
public class Student implements Serializable {
	
	private static final long serialVersionUID = 385984406808495533L;
	
	/**
	 * ��ȡ����д����������ͨ����������ȡ���󷵻� ʵ�ֶ������¡
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
	 * ���������ģ����л���¡�����д��
	 * ���Գ�����������෽��
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
		// ˵�������� ByteArrayInputStream �� ByteArrayOutputStream ����� close ����û���κ�����
		// �����������ڴ����ֻҪ�������������������ܹ��ͷ���Դ����һ�㲻ͬ�ڶ��ⲿ��Դ�����ļ��������ͷ�
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
