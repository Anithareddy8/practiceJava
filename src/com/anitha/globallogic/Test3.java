package com.anitha.globallogic;
public class Test3{
public static void main(String[] args) {
        {
            String s1 = new String("sat");
            String s3 = new String("sat");
           // System.out.println(s1==s3);
           // System.out.println(s1.equals(s3));
            StringBuffer s2 = new StringBuffer("sat");
            StringBuffer s4 = new StringBuffer("sat");
            //System.out.println(s2==s4);
            //System.out.println(s2.equals(s4.toString()));
            System.out.println((s1==s2.toString())); 
//System.out.println(s1.equals(s2.toString()));
           // System.out.println(s1==s2); 
            System.out.println(s1.equals(s2.toString()));
}
    }
}
