package com.anitha;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class A {

	String name="";
	
	public A(String name) {
		this.name=name;
	}
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>(1);
		ArrayList<String> al1=new ArrayList<>(1);
		al.add("1");
		al1.add("1");
	Set<A> set=new HashSet<>();
		set.add(new A("a"));
		set.add(new A("a"));
	System.out.println(set.size());
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return name.equals(((A)obj).name.toString());
	}

}
