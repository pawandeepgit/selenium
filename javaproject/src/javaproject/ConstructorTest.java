package javaproject;


	public class ConstructorTest {

			String name;
			int age;

			public ConstructorTest(String name, int age) {
				this.name = name;
				this.age = age;
			}

			public static void main(String[] args) {
				
				ConstructorTest myConst = new ConstructorTest("Vikram", 32);
				System.out.println(myConst.name);
				System.out.println(myConst.age);
			}

		}




