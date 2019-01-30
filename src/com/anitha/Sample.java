package com.anitha;

import java.util.ArrayList;
import java.util.HashMap;

public class Sample {

	//public static void main(String[] args) {
//		final HashMap<String, String> hm = new HashMap<String, String>();
//		hm.put("1", "Anitha");
//		System.out.println(hm);
//		hm = new HashMap<String, String>();
//		final ArrayList<String> hm1 ;
//		hm1=new ArrayList<String>();
//		hm1=new ArrayList<String>();
//		final String s1;
//		s1="b";
//		final int a=1;
//		a=2;
// }
	
	
	/*
	bank{
	
	@autowire
		payment obj ;
	
	A(){
	
	obj.A();

	}
	
	}
	 */
	
 class Bank
	{
		public void test()
		{
			Payment p1=new Payment();
			p1.A();
			
			try {
			
				Sample s  = new Sample() {
					
				};
			}
			catch(Throwable t){
				
			}
		}
		
	}
	 class Payment 
	{
		public void A()
		{
			
		}
	}
	

	
	public void test()
	{
		System.out.println("HeLLO test method is calling");
	}
	public static void main(String[] args) {
	
		
		Sample out=new Sample();
		Sample1 in = out.new Sample1();
		in.test1();
	}
		
	public class Sample1 {

		
		public void test1()
		{
			System.out.println("test1 () is calling");
		}
	
		}


}
