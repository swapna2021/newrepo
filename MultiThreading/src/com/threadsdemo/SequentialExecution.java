package com.threadsdemo;

public class SequentialExecution {
	
	void mobileproducts()
	{
		for(int i=1;i<=10;i++)
		System.out.println("mobileproducts:"+i);
	}

	public static void main(String[] args) {
		
		SequentialExecution se = new SequentialExecution();
		se.mobileproducts();
		for(int j=1;j<=10;j++)
		{
			System.out.println("tv product:"+j);
		}
		
	}

}
