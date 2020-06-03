package javaproject;

public class OddEven {

	public static void main(String[] args) {
	int oddSum=0;
	int evenSum=0,i;
	System.out.println("odd number     even number");
	for(i=1;i<=50;i++)
	{
		if(i%2!=0) {
			oddSum=oddSum+i;
			System.out.print("         "+i+"     ");
		}
		else {
			evenSum=evenSum+i;
			System.out.println(i);
		}
			
		}
			
	System.out.println("-------------------");
	System.out.println("Sum is--"+oddSum+"     "+evenSum);


	}
}


