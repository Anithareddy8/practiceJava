package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListreverseEvenNo {

	public static void main(String[] args) {
		ArrayList <Integer>list=new ArrayList<>();


		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Integer integer=(Integer)itr.next();
			
			if(integer%2!=0)
			{
				itr.remove();
			}

					}
		Collections.reverse(list);

		System.out.println(list);
	}	}
//10,8,6,4,2