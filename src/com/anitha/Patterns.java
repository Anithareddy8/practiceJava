package com.anitha;

public class Patterns {

	public static void main(String[] args) {
			for (int j = 0; j < 5 ; j++) {
				int temp=0;
				
				String text="*";
				if(j%2!=0)
				{
					text=j+"";
				}
				while(temp<=j) {
					System.out.print(text);
					temp++;
				}
				System.out.println("");
			
			}
	}
	
}
