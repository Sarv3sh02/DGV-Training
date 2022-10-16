import java.util.Scanner;

class Play{
 private String name;
 private String game;
 private int year;
 private int score;

 Scanner sc=new Scanner(System.in);

    public void setDetails(){
    name=sc.nextLine();
    game=sc.nextLine();
    year=sc.nextInt();
    score=sc.nextInt();
    }
    public void getDetails(){
	System.out.println(name+" "+year+" "+game+" "+score);
    }

	  public String getGame(){
  		return game;
      }
      public void setGame(String g){
            game=g;
      }

}
class Training{
 public static void main(String[] args){ 
	  Scanner s=new Scanner(System.in);
		Play p=new Play();
		p.setDetails();
		p.getDetails();
		String st=s.nextLine();
		p.setGame(st);
		System.out.println(p.getGame());
		p.getDetails();

 } 
}