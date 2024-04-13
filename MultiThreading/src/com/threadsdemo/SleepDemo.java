package com.threadsdemo;

public class SleepDemo extends Thread {
	
	public void run()
	{
		for(int i=1;i<=35;i++)
		{
			System.out.println("seat layout:"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
      SleepDemo sd = new SleepDemo();
      sd.start();
      SleepDemo sd1 = new SleepDemo();
      sd1.start();
	}

}
