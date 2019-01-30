package com.anitha;

import java.util.HashMap;

public class NumberofOccuranceInSstring {

	public static void main(String[] args) {
String s1="Anitha";
String eachchar="";
HashMap<String,Integer> hm=new HashMap<String,Integer>();
for (int i=s1.length()-1;i>0;i--)
{
	eachchar =s1.charAt(i)+"";
	if(hm.get(eachchar)==null)
	{
		hm.put(eachchar, 1);
		
	}
	else
	{
		hm.put(eachchar, hm.get(eachchar)+1);
	}
}
System.out.println(hm);
	}

}
