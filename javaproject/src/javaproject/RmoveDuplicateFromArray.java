package javaproject;

import java.util.Scanner;

public class RmoveDuplicateFromArray {

	public static void main(String[] args) {
		int[] arr=new int[6];
		 int[] temp = new int[6];
		int i,j;
		Scanner sc= new Scanner(System.in);    //for user input(slandered input stream)
		 
		for(i=0;i<6;i++)
		{
				System.out.print("Enter values for "+i+"position"); 		
		    	arr[i]=sc.nextInt();
		}
			      
				int n =arr.length;
				j=0;
				
				for (i=0; i<n; i++)
				{
				            if (arr[i] != arr[i+1]) {
				            	
				                  temp[j] = arr[i];
				            }
				         
				        temp[j++] = arr[n-1];   
	            }
				         
				        // Changing original array
				        for ( i=0; i<j; i++) {
				            arr[i] = temp[i];
				      
				        
				    }

	for(i = 0;i<j;i++)
	{		//String[] arr;
		System.out.print(arr[i] + " ");
	}
	sc.close();
}}