package com.anitha;

public interface Interface1 {

	public  final int id=108;
	
}

 interface Interface2 {

	public  final int id=108;
	
}
 
 class Test implements Interface1 , Interface2
 {
	public static void main(String[] args) {
		System.out.println(id);
	} 
 }