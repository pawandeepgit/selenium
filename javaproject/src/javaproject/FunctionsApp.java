package javaproject;

	public class FunctionsApp {

			public static void greeting() {
				System.out.println("Hello");
			}

			public static int add(int a, int b) {
				int c = a + b;
				// System.out.println("The sum of " + a + " and " + b + ": " + c);
				return c;
			}

			public static void main(String[] args) {

				greeting();
				greeting();
				int totalNumber = add(5, 4);
				System.out.println("Total Number: " + totalNumber);
				add(24, 987);

			}

		

	}


