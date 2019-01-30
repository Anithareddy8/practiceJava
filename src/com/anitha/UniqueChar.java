package com.anitha;

import java.util.HashSet;
import java.util.Set;

public class UniqueChar {

	public static void main(String[] args) {
		String s1="anithareddy";
		char []arr=s1.toUpperCase().toCharArray();
		Set < Character> set=new HashSet<Character>();
		
		for(char c:arr )
		{
			set.add(c);
		}
		System.out.println(set);
	}
	
	// 123456 - SORTED ARR ASC
	//ARR[ARR.LENT-1]
	//96,86,9 - UN SORTE
	int a=0;
	UniqueChar ae=new UniqueChar();
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<4;j++)
		{
			a=j;
			System.out.println(i);
		}
	}
}
}
