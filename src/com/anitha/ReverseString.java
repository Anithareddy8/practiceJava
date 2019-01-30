package com.anitha;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ReverseString {

	
	public static void main(String[] args) {
		String s1="anitha";
//		System.out.println(s1.charAt(6));
//		System.out.println(s1.charAt(5));
//for(int i=s1.length()-1; i>=0 ;i--)
//{
//	System.out.println(s1.charAt(i));   
//}
//	
	HashMap<String,Integer>hm=new HashMap<String,Integer>();
	hm.put("Ani", 8);
	hm.put("an", 3);
	hm.put("a", 1);
	Set s=hm.entrySet();
	System.out.println(s);
	Set set=hm.keySet();
	Collection c=hm.values();
	System.out.println(c);
System.out.println(set);
Map <String,Integer>t1=new TreeMap <String,Integer>(hm); 
System.out.println(t1);
	
}

}
