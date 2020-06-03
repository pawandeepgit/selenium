package javaproject;

import java.util.Scanner;

public class FabonacciSeries {

	public static void main(String[] args) {
		int num,i,sum=0;
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter number upto which you want to create the fabonacci series- ");  
		num=sc.nextInt();
		int a=0,b=1;
		for(i=1;i<=num;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			//System.out.println(a+""+b+" ");
			
			//sum=i+sum;
			System.out.print(+sum+" ");
		}
		    
		}
		
	}

