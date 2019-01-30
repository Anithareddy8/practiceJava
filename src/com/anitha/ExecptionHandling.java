package com.anitha;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExecptionHandling {
	
	{
		System.out.println("initializer............");
		
	}
	
	static {
		System.out.println("static blockkkk............");
	}
	
	ExecptionHandling(){
		System.out.println("constructor ............");
	}
	
	static void test1() throws Exception  {
	
	//Connection c = DriverManager.getConnection("");
		System.out.println("static method");
	
	}
	
	void ins() {
		
		System.out.println("ins method");
		
	}
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//throwExecption();
//		test1();
		ExecptionHandling ce  = new ExecptionHandling();
//		ce.ins();
//		ce.ins();
	}

}
