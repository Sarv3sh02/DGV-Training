package second;
import java.util.Scanner;

public class Triangle implements Shape
{
	Scanner scanner=new Scanner(System.in);
	int base,height;
	public void getDetails() {
		System.out.println("Enter base, height");
		base=scanner.nextInt();
		height=scanner.nextInt();
	}
	public double area() {
		return 0.5*base*height;
	}
	
}
