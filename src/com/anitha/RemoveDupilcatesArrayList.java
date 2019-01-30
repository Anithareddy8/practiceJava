package com.anitha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDupilcatesArrayList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList(1);
//		al.add(1);
//		al.add(2);
//		al.add(3);
//		al.add(2);
//		
		ArrayList al1=new ArrayList(1);
		Set<RemoveDupilcatesArrayList> set=new TreeSet();
		al.add(1);
		al1.add(1);
	System.out.println(set);
		
//		Iterator itr=al1.iterator();
//		while(itr.hasNext())
//		{
//			Integer integer=(Integer)itr.next();
//			itr.remove();
//			//al.remove(1);
//		}
		al1.trimToSize();
		System.out.println(al1);
		
		
		
		//		ArrayList al=new ArrayList();
		//		al.add(1);
		//		al.add(2);
		//		al.add(1);
		//		al.add(2);
		//		ArrayList a2=new ArrayList();
		//		for(int i=0;i<al.size();i++)
		//		{
		//			
		//		if(!(a2.contains(al.get(i))))
		//		{
		//			a2.add(al.get(i));
		//		}
		//		}
		//		System.out.println(a2);
		//		
		//		//(or)
		//		//for(int i=0;i<al.size();i++);
		//		//{
		////			for(int j=i+1;j<al.size();j++)
		////			{
		////				if(al.get(i)==al.get(j)) {
		////					al.remove(j);
		////				}
		////			}
		//		//	
		//		//}
		//		
		//	HashMap<Integer, String> hm=new LinkedHashMap<Integer, String>();	
		//	hm.put(1, "Anitha");
		//	hm.put(2, "Ani");
		//	hm.put(3, "Anmmu");
		//	hm.put(4, "Anitha");
		//	hm.put(5, "An");
		//	hm.put(6, "An");
		//	Set s1= new TreeSet<String>(hm.values());
		//	System.out.println(s1);
		//	HashMap<Integer, String> hm1=new HashMap<Integer, String> ();
		//	Iterator itr=s1.iterator();
		//	while(itr.hasNext())
		//	{
		//		
		//		String value = iterator.next();
		//		for(Map.Entry<Integer, String> me:hm.entrySet())
		//		{
		//			if(value.equals(me.getValue())&&!hm1.containsValue(value))
		//			{
		//				hm1.put(me.getKey(), value);
		//			}
		//		}
		//	}
		//	
		//		
		//		
		//		
		//		
		//		HashMap<String, String> hm1 = new HashMap<String, String>();
		//		hm1.put("1", "a");
		//		hm1.put("2", "a");
		//		hm1.put("3", "b");
		//		Set<String> set =new HashSet<String>();
		//		
		////		HashMap<String, String> hm2 = new HashMap<String, String>();
		////		
		////		Set s=hm1.entrySet();
		////		System.out.println(s);
		////		
		////		Iterator itr=s.iterator();
		////				{
		////			while(itr.hasNext())
		////			{
		////				Map.Entry me=(Map.Entry)itr.next();
		////				System.out.println("key:"+me.getKey() + "::::::::::::"+ me.getValue());
		////			}
		////				}
		////		
		//		
		//		
		//		
		//		
		//		
		//		
		//		
		//		
		//		
		////		for(Map.Entry<String, String> s :hm1.entrySet())
		////		{
		////			System.out.println("key:"+s.getKey()+":val:"+s.getValue());
		////		}
		//
		////	Set s1=new HashSet(al);	
		//	
		////	System.out.println(s1);

		//		
		//		TreeSet t=new TreeSet();
		//		t.add(1);
		//		t.add(2);
		//		t.add(1);
		//		
	}

}
