package com.anitha;

class TestEX {


	 static void test()
	{
		System.out.println("Testex method is calling");
	}
}
class Demo extends TestEX
{
	 void test1()
	{
		System.out.println("sample class method is calling");

	}
//	 public static void main(String[] args) {
//
//			Demo s1=new Demo();
//			s1.test();
//			s1.test1();
//		}
}
	class InheritanceDemo
	{
		public static void main(String[] args) {

			Demo s1=new Demo();
			s1.test();
			s1.test1();
		}

}


