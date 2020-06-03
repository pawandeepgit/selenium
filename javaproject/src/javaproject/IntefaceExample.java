package javaproject;

class  InterfaceTest implements MyInterface{
  
	
	public void myfunction1() {
		System.out.println("Inside myfunction1");
		
		}

	
	public void myfunction2() {

   System.out.println("inside myfuction2");
	}
}
     public class IntefaceExample{

       	public static void main(String[] args) {
		InterfaceTest obj=new InterfaceTest();
		obj.myfunction1();
		obj.myfunction2();
	
	}

}
