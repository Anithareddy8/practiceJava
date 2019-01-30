package com.anitha;

public class withoutforloop {

	public static int print(int x)
	{
		System.out.println(x);
		if(x==1)
			return 0;
		return print(x-1);
	}
	
//	public static int factorial(int n)
//	{
//	   if (n == 0)
//	      return 1;
//	   else
//	      return n * factorial(n-1);
//	}
	
	public static void main(String[] args) {
	//System.out.println(sum(1));

		print(5);
		
		//factorial(3);
		
		
	}

}
