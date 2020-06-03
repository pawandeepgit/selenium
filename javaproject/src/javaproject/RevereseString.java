package javaproject;

public class RevereseString {

	public static void main(String[] args) {
		String str="hello how are you";
		String revStr="";
		int i;
		int limit=str.length();
		for(i=limit-1;i>=0;i--) {
		revStr +=str.charAt(i);
						
			
		}
		System.out.println("hello how are you");
		System.out.println("Reverse stirng is "+revStr);

	}

}
