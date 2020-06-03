package javaproject;


  
class ArrayOneDimApp   {

public static void main(String[] args)  {
	int[] arr=new int[5];
	int i,sum=0;
	
	for(i=0;i<=4;i++)
	{
		arr[i]=i+5;
		//i--;
		sum=sum+arr[i];
		
	
	
System.out.println("sum of arr is["+ i +"] "+ sum);
	}
}
}
