package javaproject;

import java.util.Scanner;

public class PalindromeStr {
	
	public static void main(String[] args)
	{
		boolean flag=false;
		System.out.print("Enter  string "); 		
		Scanner sc= new Scanner(System.in);    //for user input(slandered input stream)
	 	String str=sc.nextLine();
	 	sc.close();
	 	int limit=str.length();
	 	System.out.println("Lenght is"+limit);
		int i,j;
		for(i=0,j=limit-1;i<limit/2;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				//System.out.println(str.charAt(i)+"  "+str.charAt(i));
				flag=true;
				break;
			}
				
			}
		if (flag==false) {
			System.out.println("string is palindrome");
		}else {
			System.out.println("string is not palindrome");

	}
	}}

