package first;

import java.util.Scanner;

public class School {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		
//		Subject sb=new Subject("java","10D","diff");
//		Subject sb1=new Subject("js","8D","med");
//		Subject sb2=new Subject("c++","7D","easy");
//		Student s=new Student("SK","CSE",20, new Subject[]{sb,sb1,sb2});
//		s.display();
		Subject[] s=new Subject[4];
		
		for(int i=0;i<4;i++) {
			String n=sc.nextLine();
			String d=sc.nextLine();
			String di=sc.nextLine();
			
			s[i]=new Subject(n,d,di);
			
		}
		for(int i=0;i<4;i++) {
			System.out.println(s[i]);
		}
		
		sc.close();
	}
}
