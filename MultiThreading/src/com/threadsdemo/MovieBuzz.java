package com.threadsdemo;

class ListMovies extends Thread
{
	public void run()
	{
		if(Thread.currentThread().getName().equals("balaya"))
		{
		for(int j=1;j<=10;j++)
		{
			System.out.println("balaya movies:"+j);
		}
		}
		else
		{
				for(int i=1;i<=10;i++)
				{
					System.out.println("chiru movie:"+i);
				}
	}
}
}
public class MovieBuzz {

	public static void main(String[] args) {
		
		ListMovies lm = new ListMovies();
		lm.setName("chiru");
		lm.start();
		
	}

}
