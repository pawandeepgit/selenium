package javaproject;

//import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int i;
		boolean flag =false;
		for(i=1;i<=100;i++) {
			flag=true;	
		
			for(int j=2;j<i;j++){
		
			if (i%j==0)
				//if (i%j!=0)
			{
			//	flag==true
			flag=false;	
			break;
			}
			

	}
			if (flag==true) {
				System.out.print(i+" ");
			}
		
	}

	}
}