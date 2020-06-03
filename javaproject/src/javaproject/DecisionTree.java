package javaproject;

public class DecisionTree {

	public static void main(String[] args) {

		int r = 3, c = 2, i, n, j, half1 ;
		int total = (int) Math.pow(c, r);
		System.out.println(total);
		half1 = total/c;
		System.out.println(half1);
		for (i = 0; i <= c; i++) {         //column
			//half2=half1;
			n=total;
			for (j = 1; j <= total; j++,n--) {   //rows
			//	half1 = total /c;
								
				if (j<= half1) {
					System.out.print("F");
				}
				 else {
						System.out.print("T");
					}//System.out.println(half1);
				//half1=half1/2;
			}
				
				half1=half1/c;
			System.out.println();
		}
	

}

}