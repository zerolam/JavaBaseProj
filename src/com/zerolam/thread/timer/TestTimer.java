package com.zerolam.thread.timer;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 请模拟写出双重定时器
 * 要求：使用定时器,间隔 4 秒执行一次，再间隔 2 秒执行一次，以此类推执行。
 * 
 * 测试过程中，发现程序不会终止，原因是系统默认当Timer运行结束后，如果没有手动终止，那么则只有当系统的垃圾收集被调用的时候才会对其进行回收终止
 * 想要让Timer终止的方案：
 * 方案一：调用系统垃圾回收 System.gc(); --- 太粗暴，不符合实际
 * 方案二：调用Timer的cancel() 方法
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
		timer.schedule(new MyTimerTask1(timer), 3000, 2000);// 3秒后开始执行，每2秒执行一次
	}
	
	public static void stopTimerByGc(){
		Timer timer = new Timer();
		timer.schedule(new MyTimerTask2(), 2000);
		
	}
}

/**
 * 自定义时间任务
 * @author Administrator
 */
class MyTimerTask extends TimerTask{
	private int count;
	public MyTimerTask(int count) {
		this.count = count;
	}
	@Override
	public void run() {
		System.out.println("执行自定义TimerTask");
		count++;
		new Timer().schedule(new MyTimerTask(count), 2000 + (count%2)*2000);
	}
}

/**
 * 自定义时间任务-用于测试停止Timer
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
			System.out.println("停止Timer, count =" + count);
		}	
		System.out.println("测试停止Timer, count =" + count);
		count++;
	}
}

/**
 * 自定义时间任务-用于测试停止Timer
 * @author Administrator
 *
 */
class MyTimerTask2 extends TimerTask{
	
	@Override
	public void run() {
		System.out.println("测试停止Timer");
		System.gc();
	}
}