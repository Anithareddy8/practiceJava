package com.anitha;

public class Pattern1 {

	public static void main(String[] args) {
		char ch='A';
		int j=1;
		for(int i=0;i<=6;i++)
		{
			String text=ch+"";
			int temp=0;
			if(i%2!=0)
			{
				text=j+"";
				j++;
				ch++;
			}

			while(temp<=i)
			{
				System.out.print(text);
				temp++;

			}

			System.out.println();
		}
	}

}
