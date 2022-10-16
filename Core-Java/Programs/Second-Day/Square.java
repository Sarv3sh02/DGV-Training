package second;

import java.util.Scanner;

public class Square implements Shape{

	Scanner scanner=new Scanner(System.in);
	int side;
	public void getDetails() {
		System.out.println("Enter side");
		side=scanner.nextInt();
	}
	public double area() {
		return side*side;
	}
}
