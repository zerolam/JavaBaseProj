package com.zerolam.system;

/**
 * ����System �����Ĺ���
 * 
 * @author Administrator
 *
 */
public class TestSystem {

	public static void main(String[] args) {
		/*
		 * ��ȡϵͳ�г���������
		 */
		System.out.println("Java ����ʱ�����汾: " + System.getProperty("java.version")); 	// Java����ʱ�����汾
		System.out.println("Java ��װĿ¼: " + System.getProperty("java.home")); 			// Java��װĿ¼
		System.out.println("����ϵͳ������: " + System.getProperty("os.name")); 				// ����ϵͳ������
		System.out.println("����ϵͳ�İ汾: " + System.getProperty("os.version")); 			// ����ϵͳ�İ汾
		System.out.println("�û����˻�����: " + System.getProperty("user.name")); 			// �û����˻�����
		System.out.println("�û�����Ŀ¼: " + System.getProperty("user.home")); 			// �û�����Ŀ¼
		System.out.println("�û��ĵ�ǰ����Ŀ¼: " + System.getProperty("user.dir")); 			// �û��ĵ�ǰ����Ŀ¼

	}
}
