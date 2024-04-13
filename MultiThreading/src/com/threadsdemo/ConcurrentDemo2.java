package com.threadsdemo;

class BusReservation extends Thread
{
	//seat layout
	public void run() {
	for(int i=1;i<=35;i++)
	{
		System.out.println("seat layout"+i);
	}
	}
}
public class ConcurrentDemo2 {

	public static void main(String[] args) {
		
		BusReservation  br = new BusReservation();
		br.start();
		BusReservation br1 = new BusReservation();
		br1.start();
	}

}
