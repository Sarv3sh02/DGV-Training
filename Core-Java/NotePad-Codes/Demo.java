import java.util.Scanner;

class Demo{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int choice=0;
  do{
  System.out.println("Enter no. one");
  int n1=sc.nextInt();
  System.out.println("Enter no. two");
  int n2=sc.nextInt();
  int res=n1+n2;
  System.out.println(res);
  System.out.println("do you want to next numbers? 0-No 1-Yes");
  choice=sc.nextInt();
  
  }
  while(choice==1);
 }
}
