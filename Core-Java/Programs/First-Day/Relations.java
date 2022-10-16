package first;

public class Relations {

	public static void main(String[] args) {
		
		Address ad=new Address();
		ad.setCity("Panchkula");
		ad.setState("Haryana");
		ad.setPincode(134112);
		
		Person p=new Person();
		p.setName("Sarvesh");
		p.setAge(20);
		p.setAdres(ad);
		
		System.out.println(p);

	}

}
