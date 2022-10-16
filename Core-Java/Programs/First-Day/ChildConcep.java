package first;

public class ChildConcep extends ParentConcep{
	
	
	public void printName() {
		System.out.println("I am a child");
	}
//	overriding
	public void doSomething() {
		System.out.println("Child's Function");	
	}
   public void parentCall() {
	   super.doSomething();
   }
}
