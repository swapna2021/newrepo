package com.threadsdemo;


class Laptop extends Thread
{
	public void run()
	{
		for(int k=1;k<=10;k++)
		{
			System.out.println("latop model"+k);
		}
	}
}

//step1:need to extends Thread
//step2: need to implements Runnable
public class ConcurrentDemo implements Runnable {
	
	//step2:need to override run() method
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("mobileproducts:"+i);
		}
		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {
		
		//step3:start thread by using start() method
		ConcurrentDemo cd = new ConcurrentDemo();
		Thread t = new Thread(cd);
		t.setName("Chiru");
		t.start();
		Laptop l = new Laptop();
		l.start();
		System.out.println("active threads are:"+Thread.activeCount());
		//tv products
		for(int j=1;j<=10;j++)
		{
			System.out.println("tv product:"+j);
		}
		

	}

}
