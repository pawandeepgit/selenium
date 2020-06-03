package javaproject;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter number- ");  
		int number= sc.nextInt();  
		String str="";
		
	if (number % 15 == 0) {
	            str= "fizzbuzz";
	        } else if (number % 5 == 0) {
	            str= "buzz";
	        } else if (number % 3 == 0) {
	            str= "fizz";
	        }

	        else {
	        	str="Number is not fizz OR buzz OR fizzbuzz";
	        }
	System.out.print("number "+str);  
	sc.close();
	
	}

}
