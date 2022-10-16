package first;

public class Person {
	private String name;
	private int age;
	Address adres;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAdres() {
		return adres;
	}
	public void setAdres(Address adres) {
		this.adres = adres;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", adres=" + adres + "]";
	}
	
}
