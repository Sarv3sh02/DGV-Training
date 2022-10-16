import java.util.Scanner;

class Stud{

 private String name;
 private int year;
 private int roll; 
 Scanner scanner=new Scanner(System.in);

 public void getDetails(){
  System.out.println("Enter name, roll and year resp");
  name=scanner.nextLine();
  roll=scanner.nextInt();
  year=scanner.nextInt();
}
public void display(){
System.out.println(name+" "+roll+" "+(2022-year));
}
}
class Demo1{
public static void main(String[] args){
Stud s=new Stud();
s.getDetails();
s.display();
}
}