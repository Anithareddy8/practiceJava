package com.anitha.globallogic;

class A1
{
public void m1(){
        //System.out.println("A1");
        String x="10";
    }
}
class B1 extends A1
{
public void m1(){
        System.out.println("B1");
    }
}
class C extends B1
{
public void m1(){
        System.out.println("C");
    }
}

public class Test {
	
public static void main(String[] args) {
       // C c = new C();
        //c.m1();
       // ((B1)c).m1();
        //((A1)((B1)c)).m1();
	A1 a=new A1();
//	//a.m1();
//	//B1 a=new B1();
//	A1 a=new C();
	a.m1();
	//int x=20;
	String x="20";
	System.out.println(x);
	
	int in =1;
	Integer obj =in;
	
f

}
}

