package javaproject;

import java.util.Scanner;

//import java.util.Scanner;

public class MathewsProblem {

	// @SuppressWarnings("unused")
	public static void main(String[] args) {
		int a, i, limit, m, count = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); // System.in is a standard input stream
		System.out.print("Enter the number up to which you want to count the occurence of 7 ");
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait (driver, 20);
	 //   wait.until(ExpectedConditions.VisibilityofElementLocated(By.xpath(""//button[@value='Save Changes']"")));


		limit = sc.nextInt();

		for (i = 1; i <= limit; i++) {

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

		sc.close();

	}
}
