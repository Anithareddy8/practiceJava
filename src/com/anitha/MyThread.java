package com.anitha;

 class MyThread  extends Thread{
	 public  void run()
	 {
	 	System.out.println("run method calling");
	 }
	 public static void main(String[] args) {

		MyThread t=new MyThread();
		MyThread t1=new MyThread();
		t.start();
       t.run();
       t.start();
       t.run();
	}
}

