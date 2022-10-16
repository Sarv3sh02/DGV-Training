//these type of classes are known as javabean as it only has getter,setter,variables

import java.util.Scanner;

class Details{
 private String name;
 private String team;
 private int score;

 public String getName(){
  return name;
  }
 public void setName(String n){
   name=n;
  }

 public String getTeam(){
  return team;
  }
 public void setTeam(String t){
   team=t;
 }

 public int getScore(){
  return score;
  }
 public void setScore(int s){
   score=s;
 }

}
class Player{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  Details d=new Details();
  String nam=sc.nextLine();
  d.setName(nam);
  String tm=sc.nextLine();
  d.setTeam(tm);
  int sco=sc.nextInt();
  d.setScore(sco);
  
  System.out.println(d.getName());
  System.out.println(d.getTeam());
  System.out.println(d.getScore());
 }
}