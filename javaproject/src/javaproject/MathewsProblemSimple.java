package javaproject;

//import java.util.Scanner;

public class MathewsProblemSimple {

	
	public static void main(String[] args) {
		int a, i, m, count = 0;
		for (i = 1; i <=177; i++) {

			a = i;

			while (a > 0) {

				m = a % 10;
				if (m == 7) {
					count++;
				}
				a = a / 10;

			}
		}

		System.out.println("7 occured " + count + " times");

		

	}
}
