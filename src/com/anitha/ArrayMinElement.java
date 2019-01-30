package com.anitha;

public class ArrayMinElement {
public static int minArray(int[] arr)
{
	int min=arr[0];
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 if(arr[i]<min)
		 {
			 min=arr[i];
		 }
	 }
	return min;
	 
}

 
public static int secondMin(int []arr) {
int secondmin=-1;
int min=arr[0];

	for (int i=0;i<=arr.length-1;i++)
{
	if(arr[i]<min)
		secondmin=min;
		min =arr[i];
}
	return secondmin;
}
	public static void main(String[] args) {
int []arr= {4,5,7,9,8,2,1};
//System.out.println(ArrayMinElement.minArray(arr));
System.out.println(ArrayMinElement.secondMin(arr));
	}

}
