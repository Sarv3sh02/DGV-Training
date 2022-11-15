package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Employee;

public class EmployeeController {
	
	Configuration configuration;
	Session session;
	SessionFactory sessionFactory;
	
	public EmployeeController() {
		configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		sessionFactory=configuration.buildSessionFactory();
	}
	
	public void insert(Employee employee) {
		session=sessionFactory.openSession();
		session.beginTransaction();
    	session.save(employee);
    	session.getTransaction().commit();
		session.close();
	}
	
	public void getSingleEmployee(int id) {
		session=sessionFactory.openSession();
		Employee emp=(Employee)session.get(Employee.class,id);
    	System.out.println(emp.getName()+" 	"+emp.getProjectList().get(1).getName());
    	session.close();
	}
	
	
}
