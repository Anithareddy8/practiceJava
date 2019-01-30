package com.anitha.globallogic;

public class Test5 {

	public static void main(String[] args) {
		A b=new A();
		System.out.println(b.methodA());
		
		System.out.println(b.methodA(""));
	}
	

}
class A
{
	public int methodA()
	{
		//System.out.println("method a parent clss");
		return 0;
		
	}
	public String methodA(String s1)
	{
		//System.out.println("method a parent clss");
		return null;
		
	}
}
//class B extends A
//{
//	public int methodA()
//	{
//		System.out.println("method a child clss");
//		return 0;
//		
//	}
//	public String methodA(String s1)
//	{
//		System.out.println("method a parent clss");
//		return null;
//		
//	}
//}
