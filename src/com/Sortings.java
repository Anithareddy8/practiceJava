package com;

import java.util.Arrays;

public class Sortings {

   static  void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        int curr=0;
        int nxt = 0;
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
            { 
            	curr=arr[j];
            	nxt=arr[j+1];
            	if (curr < nxt) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = curr; 
                    arr[j] = nxt; 
                    arr[j+1] = temp; 
                } 
            }
    } 
   
   
   static int change(int i)
   {
	   i =10;
	   
	   return i;
   }
  

	public static void main(String[] args) {
		int[] arr= {8,9,1,2,3};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
//		int i =100;
//		System.out.println("bfr::"+i);
//		change(i);
//		
//		System.out.println("aftr::"+i);
		
	}

}
