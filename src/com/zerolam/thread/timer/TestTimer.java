package com.zerolam.thread.timer;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 * ��ģ��д��˫�ض�ʱ��
 * Ҫ��ʹ�ö�ʱ��,��� 4 ��ִ��һ�Σ��ټ�� 2 ��ִ��һ�Σ��Դ�����ִ�С�
 * 
 * ���Թ����У����ֳ��򲻻���ֹ��ԭ����ϵͳĬ�ϵ�Timer���н��������û���ֶ���ֹ����ô��ֻ�е�ϵͳ�������ռ������õ�ʱ��Ż������л�����ֹ
 * ��Ҫ��Timer��ֹ�ķ�����
 * ����һ������ϵͳ�������� System.gc(); --- ̫�ֱ���������ʵ��
 * ������������Timer��cancel() ����
 * 
 * @author Administrator
 */
public class TestTimer {
	
	public static void main(String[] args) {
		//doubleTimerMethod1();
		//stopTimer();
		stopTimerByGc();
	}
	
	
	public static void doubleTimerMethod1(){
		int count = 1;
		new Timer().schedule(new MyTimerTask(count), 2000 + count*2000);
		while(true){
			System.out.println(Calendar.getInstance().getTime());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void stopTimer(){
		Timer timer = new Timer();
		timer.schedule(new MyTimerTask1(timer), 3000, 2000);// 3���ʼִ�У�ÿ2��ִ��һ��
	}
	
	public static void stopTimerByGc(){
		Timer timer = new Timer();
		timer.schedule(new MyTimerTask2(), 2000);
		
	}
}

/**
 * �Զ���ʱ������
 * @author Administrator
 */
class MyTimerTask extends TimerTask{
	private int count;
	public MyTimerTask(int count) {
		this.count = count;
	}
	@Override
	public void run() {
		System.out.println("ִ���Զ���TimerTask");
		count++;
		new Timer().schedule(new MyTimerTask(count), 2000 + (count%2)*2000);
	}
}

/**
 * �Զ���ʱ������-���ڲ���ֹͣTimer
 * @author Administrator
 *
 */
class MyTimerTask1 extends TimerTask{
	private Timer timer;
	int count = 0;
	public MyTimerTask1(Timer timer){
		this.timer = timer;
	}
	@Override
	public void run() {
		if(count==5){
			this.timer.cancel();
			System.out.println("ֹͣTimer, count =" + count);
		}	
		System.out.println("����ֹͣTimer, count =" + count);
		count++;
	}
}

/**
 * �Զ���ʱ������-���ڲ���ֹͣTimer
 * @author Administrator
 *
 */
class MyTimerTask2 extends TimerTask{
	
	@Override
	public void run() {
		System.out.println("����ֹͣTimer");
		System.gc();
	}
}