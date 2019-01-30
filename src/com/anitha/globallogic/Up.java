package com.anitha.globallogic;
//interface Up
//{
//void arrow();
//}
//interface Down
//{
//void arrow();
//}
//
//class UpDown implements Up, Down
//{
//public void arrow()
//    {
//    }
//}

//
//interface Up
//{
//void arrow();
//}
//interface Down
//{
//int arrow();
//}
//
//class UpDown implements Up, Down
//{
////public void arrow()
////    {
////    }
//
//public int arrow()
//    {
//    }
//}

interface Up
{
	default void test()
	{
		System.out.println("default method");
	}
	default int test1()
	{
		System.out.println("default method");
		return 0;
	}

}
