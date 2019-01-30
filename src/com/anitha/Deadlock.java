package com.anitha;

public class Deadlock {


	public static void main(String[] args) {
		final String s1="Anitha";
		final String s2="Ammu";
		Thread t1=new Thread() {
		public void run()
		{
			synchronized (s1)
			{
				System.out.println("Thread1  locked " + " ::::+" +s1);
				try {
					Thread.sleep(1000);
				}
				catch(Exception e)
				{

				}
				synchronized(s2)
				{
					System.out.println("Thred1 locked "+ " ::::+" +s2);
				}
			}

		}
		};
		Thread t2=new Thread();
		{
			synchronized(s1)
			{
				System.out.println("Thread 2 locked "+ " ::::+" +s1);
				try
				{
					System.out.println("Thread 2 locked "+ " ::::+" +s1);
				}
				catch(Exception e)
				{

				}
				synchronized(s2)
				{
					System.out.println("Thread2 locked "+ " ::::+" +s2);
				}
			}
		}
		t1.start();
		t2.start();
	}

}

