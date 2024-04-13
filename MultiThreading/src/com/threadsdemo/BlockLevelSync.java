package com.threadsdemo;

public class BlockLevelSync extends Thread{

	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("i val is:"+i);
		}
		synchronized(this)
		{
		for(int j=1;j<=10;j++)
		{
			System.out.println("j val is:"+j);
		}
		}
	}
	public static void main(String[] args) {
		
		BlockLevelSync bl = new BlockLevelSync();
		BlockLevelSync bl1 = new BlockLevelSync();
		bl.start();
		bl1.start();
		

	}

}
