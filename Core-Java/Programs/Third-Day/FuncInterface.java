package third;

@FunctionalInterface
interface FuncInterfaceExample{
	public void testing();
}

public class FuncInterface {
	public static void main(String args[]) {
		
// 	Method one
//		(->) Lambda Expression
//		FuncInterfaceExample f = ()  -> {
//			System.out.println("Testing functional interface");
//		};

//Method two
		
		FuncInterfaceExample f=new FuncInterfaceExample() {
			@Override
			public void testing() {
				System.out.println("Testing functional interface");
			}
		};
		
		f.testing();
	}
}
