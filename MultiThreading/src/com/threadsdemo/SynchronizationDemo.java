package com.threadsdemo;

public class SynchronizationDemo extends Thread {

	public synchronized void run()//method level synchronization
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("i val is:"+i);
		}
	}
	public static void main(String[] args) {
		
		SynchronizationDemo sd = new SynchronizationDemo();
		SynchronizationDemo sd1 = new SynchronizationDemo();
		sd.start();
		sd1.start();
	}

}
