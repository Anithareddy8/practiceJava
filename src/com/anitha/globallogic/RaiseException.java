package com.anitha.globallogic;

import java.util.ArrayList;

public class RaiseException {
public static void throwsIllegal(int i)
{
	if(i<0)
		{
		throw new IllegalArgumentException();
		
		}
	System.out.println("printing number:::"+i);
}



public static void classCast(Object obj)
{
	ArrayList li =(ArrayList) obj;
	
}
	public static void main(String[] args) {
		
try
{
	//throwsIllegal(-1);
	classCast("ad");
}catch(Exception e)
{
	e.printStackTrace();
	System.out.println("Exception Illigal");
}
	}

}

class P
{
public static void m1(){
        System.out.println("Parent");
    }
public static void m1(int i){
    System.out.println("Child");
}
}

class C extends P
{
public void m1(int i,String s1){
        System.out.println("Child");
    }
public void m1(int i){
    System.out.println("Child");
}
}


