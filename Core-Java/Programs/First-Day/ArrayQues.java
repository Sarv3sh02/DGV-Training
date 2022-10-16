package first;

import java.util.Scanner;


class NewException extends Exception{
	public NewException(String msg) {
		super(msg);
	}
}
public class ArrayQues {
	
	public void CheckArr(int x) throws NewException{
		if(x>100) {
			throw new NewException("Invalid value");
		}
		else {
			System.out.println("Fine");
		}
	}

	public static void main(String[] args) {
//		int a[]= {10,34,56,87,54,89};
//		ArrayAdd x=new ArrayAdd();
//		as we cannot put values of array directly while calling the func. without creating any new array we can use the method below
//		x.add(new int[] {10,34,56,87,54,89});

		Scanner sc=new Scanner(System.in);
		int [] a= new int[5];
	
		for(int i=0;i<5;i++) {
				a[i]=sc.nextInt();
		}
		ArrayQues c=new ArrayQues();
				try {
					for(int j=0;j<5;j++) {
						c.CheckArr(a[j]);
					}
				}
		catch (NewException n) {
			System.out.println(n.getMessage() );
		}
	}

}
