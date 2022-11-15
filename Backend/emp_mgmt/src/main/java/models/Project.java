package models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="projects")
public class Project {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@ManyToMany()
	@JoinTable(name="employee_projects",
							joinColumns= {@JoinColumn(name="proj_id")},
							inverseJoinColumns= {@JoinColumn(name="emp_id")})
	private List<Employee> empList=new ArrayList<Employee>();

	protected Project() {
	}

	public Project(String name, List<Employee> empList) {
		this.name = name;
		this.empList = empList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	public int getId() {
		return id;
	}
	
}
