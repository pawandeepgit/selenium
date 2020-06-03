package javaproject;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter first number- ");  
	int a, m,sum=0;
	
		 a= sc.nextInt();  
		while(a>0) {
			
		m=a%10;
		sum=sum+m;
		a=a/10;
		
		}
		System.out.println("sum of digits is= " +sum);  
			
		sc.close();
		
	}

}
