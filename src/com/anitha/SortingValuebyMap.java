package com.anitha;

import java.util.HashMap;
import java.util.TreeMap;

public class SortingValuebyMap {

	public static void main(String[] args) {
//public static HashMap<String,Integer>sortByValue(HashMap<String,Integer>hm)
//{
//	
//}
		HashMap<String, Integer> hm = new HashMap<String, Integer>(); 
		  
        // enter data into hashmap 
        hm.put("Math", 98); 
        hm.put("Data Structure", 85); 
        hm.put("Database", 91); 
        hm.put("Java", 95); 
        hm.put("Operating System", 79); 
        hm.put("Networking", 80); 
       // Map<String, Integer> hm1 = sortByValue(hm); 
        TreeMap<String, Integer> t=new TreeMap<String, Integer>(hm);
        System.out.println(t);
	}

}
