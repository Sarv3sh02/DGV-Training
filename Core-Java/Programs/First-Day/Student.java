package first;

public class Student {
	private String name;
 	private String course; 
 	private int age;
 	private Subject[] sub;
 
public Student(String name, String course, int age, Subject[] sub) {
	this.name = name;
	this.course = course;
	this.age = age;
	this.sub = sub;
}

public void display() {
	System.out.println(name +" "+course+" "+age+" "+sub[0].getName());
   }
}
