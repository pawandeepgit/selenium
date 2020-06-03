package javaproject;

public class Person {
	
	String name;
	int age;
	
	public void talkMethod(){
		System.out.println("Person can talk!");
	}
	
	public void singMethod(){
		System.out.println("Person can sing!");
	}


	public static void main(String[] args) {
		
		Person ps = new Person();
		ps.singMethod();
		ps.talkMethod();
		
	}

}
