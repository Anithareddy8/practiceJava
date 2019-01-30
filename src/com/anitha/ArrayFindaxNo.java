package com.anitha;

public class ArrayFindaxNo {

	public static int secondMaxNumber(int [] arr)
	{
		int great =arr[0];
		int sencondmax=-1;
		int thirdmax=-2;
		for(int i=1;i<=arr.length-1;i++)
		{
			if( arr[i]>great) {
				thirdmax=sencondmax;
				sencondmax=great;
				great =arr[i];
			}
				

		}
		return thirdmax;
	}
	public static int maxNumber(int [] arr)
	{
		int great =arr[0];
		for(int i=1;i<=arr.length-1;i++)
		{
			if( arr[i]>great) {
				great =arr[i];
			}
				

		}
		return great;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		System.out.println(ArrayFindaxNo.secondMaxNumber(arr));
	}

}
