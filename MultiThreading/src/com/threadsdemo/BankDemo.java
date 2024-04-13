package com.threadsdemo;

import java.util.Scanner;

class Account
{
	//fields
	int bal;
	long acnumber;
	
	//constructor
   public Account(int bal,long acnumber)
   {
	   this.bal = bal;
	   this.acnumber = acnumber;
   }
   public boolean isSufficientBalance(int w)
   {
	   if(bal>=w)
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
   }
   public void withdraw(int amt)
   {
	   bal = bal-amt;
	   System.out.println("current balance is:"+bal);
   }
}

class Customer extends Thread
{
	Account ac;
	String name;
	
	//constructor
	Customer(Account ac,String name)
	{
		this.ac = ac;
		this.name = name;
	}
	
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(name+" Please enter amount to withdraw");
		int amt = sc.nextInt();
		synchronized(ac)
		{
		if(ac.isSufficientBalance(amt))
		{
			ac.withdraw(amt);
		}
		else
		{
			System.out.println("sorry..insufficient bal");
		}
		}
	}
	
}

public class BankDemo {

	public static void main(String[] args) {
		
		Account ac = new Account(1000,1234567892l);
		Customer c1 = new Customer(ac,"sharuk");
		c1.start();
		Customer c2 = new Customer(ac,"salman");
		c2.start();
		
	}

}
