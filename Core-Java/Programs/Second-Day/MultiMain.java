package second;

public class MultiMain {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			MultiTreading multitread=new MultiTreading();
			try {
				multitread.start();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
