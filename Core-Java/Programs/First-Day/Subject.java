package first;

public class Subject {
	private String name;
	private String duration;
	private String level;
	
	public Subject(String name, String duration, String level) {
		this.name = name;
		this.duration = duration;
		this.level = level;
	}
	
	 public String getName() {
		 return name;
	 }
	 public String getlvl() {
		 return level;
	 }

	@Override
	public String toString() {
		return "Subject [name=" + name + ", duration=" + duration + ", level=" + level + "]";
	}
	 
	
}
