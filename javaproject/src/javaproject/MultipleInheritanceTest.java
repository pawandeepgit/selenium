package javaproject;

class MultipleInterface implements MultipalInterface1, MultipleInterface2 {

	@Override
	public void SimpleMessage() {

		System.out.println("simple message fuction");
	}

	public float Myfun2(int a, int b) {
		// div =(float) 3.4;------------------>cannot be done because this is a final
		
		return a + b / div;
	

	}

	public void Myfun1() {
		System.out.println("just for fun1");
	}

	public void Myfun2() {
		System.out.println("Just for fun2");
	}

}

public class MultipleInheritanceTest {
	public static void main(String[] args) {
		MultipleInterface obj1 = new MultipleInterface();
		MultipleInterface obj2 = new MultipleInterface();

		obj1.Myfun1();
		obj2.Myfun2();
		obj2.SimpleMessage();
		float sum = obj2.Myfun2(4, 5);
		System.out.println("answer is " + sum);

	}

}
