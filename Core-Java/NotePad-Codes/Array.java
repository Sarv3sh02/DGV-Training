import java.util.Scanner;

class Array{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int[] a=new int[10];
  for(int i=0;i<10;i++){
  a[i]=sc.nextInt();
  }
  for(int i=0;i<10;i++){
  if(a[i]%2==0)	
   {
  System.out.println(a[i]+" even");
  }
 else{
 System.out.println(a[i]+" odd");
 }
 }
}
}