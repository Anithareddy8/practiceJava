package com.anitha.globallogic;

public class Sample {

	public void m1(int i, float f)
    {
        System.out.println("int-float version");
    }
public void m1(float i, int f)
    {
        System.out.println("float-int version");
    }
public static void main(String[] args) {
        Sample test = new Sample();
        test.m1(10,10.5f); //Line 1
test.m1(10.5f,10); //Line 2
test.m1(10,10); //Line 3
test.m1((int)10.5f,10.5f); //Line 4
}


}
