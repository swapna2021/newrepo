package com.threadsdemo;

import java.util.Scanner;

class ChiruMovies extends Thread
{
	public void run()
	{
				for(int i=1;i<=10;i++)
				{
					System.out.println("chiru movie:"+i);
				}
	}
}

class BalayaMovies extends Thread
{
	public void run()
	{
				for(int j=1;j<=10;j++)
				{
					System.out.println("balaya movie:"+j);
				}
	}
}

class VenkteshMovies extends Thread
{
	public void run()
	{
				for(int k=1;k<=10;k++)
				{
					System.out.println("venki movie:"+k);
				}
	}
}
public class MovieBuzz1 {

	public static void main(String[] args) {
		
		ChiruMovies ch = new ChiruMovies();
		ch.setName("chiru");
		BalayaMovies bm = new BalayaMovies();
		ch.setName("balaya");
		VenkteshMovies vm = new VenkteshMovies();
		vm.setName("venki");
		System.out.println("welcome to moviebuzz app");
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your fav hero name!!");
		String favhero = sc.next();
		System.out.println(favhero);
		//business logic
		if(favhero.equals("chiru"))
		{
			ch.start();
		}
		else if(favhero.equals("balaya"))
		{
			bm.start();
		}
		else if(favhero.equals("venki"))
		{
			vm.start();
		}
		else
		{
			ch.start();
			bm.start();
			vm.start();
		}

	}

}
