package javaproject;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.print("Enter a number to find the factorial "); 		
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
	 	int num =sc.nextInt();
	 	sc.close();
	 	int fact=1;
	 	//int limit=str.length();
	 	for(int i=1;i<=num;i++)
	 	{
	 		fact=fact*i;
	 	}
System.out.println("factorial of "+num+" "+fact);
	}

}
