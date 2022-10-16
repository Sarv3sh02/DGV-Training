package second;

public class MultiTreading extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.print(Thread.currentThread());
			System.out.println(i);
		}
	}
}
