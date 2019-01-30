package com.anitha;

public class ArrayOccurances {
	static int[] a11= {1,2,3,2,3,1,2,3,1,2,3,3,3,3};
	static String[] st= {"abc","dcd","abc","abc"};

	public static int frequency(int[] a11,int x)
	{
		int count=0;
		for(int i=0;i<=a11.length-1;i++)
		{
			if(a11[i]==x)
			{
				count++;
			}
			System.out.println( a11[i]);

		}

		return count;
	}

	public static int stringFrequency(String[] st,String str)
	{
		int count=0;
		for(int i=0;i<=st.length-1;i++)
		{
			if(st[i].equals(str))
			{
				count++;
			}
			System.out.println( st[i]);
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(ArrayOccurances.frequency(a11, 3));
		System.out.println(ArrayOccurances.stringFrequency(st,"abc"));
	}

}
