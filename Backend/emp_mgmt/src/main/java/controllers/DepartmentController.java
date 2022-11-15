package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Department;

public class DepartmentController {
	Configuration configuration;
	Session session;
	SessionFactory sessionFactory;
	
	public DepartmentController(){
		configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		sessionFactory=configuration.buildSessionFactory();
	}

	public void insert(Department department) {
		session=sessionFactory.openSession();
		session.beginTransaction();
    	session.save(department);
    	session.getTransaction().commit();
		session.close();
	}
	
	public void display(){
		
	}
	public Department displaySingle(int id) {
		session=sessionFactory.openSession();
		Department dept=(Department)session.get(Department.class,id);
//    	System.out.println(dept.getName());
    	session.close();
		return dept;
	
	}
	public void update(Department d,int id) {
		session=sessionFactory.openSession();
		Department dept=session.get(Department.class, id);
		dept.setName(d.getName());
		session.beginTransaction();
    	session.update(dept);
    	session.getTransaction().commit();
    	session.close();
	}
	
	public void delete(int id) {
		Department dept=session.get(Department.class, id);
		session.beginTransaction();
    	session.delete(dept);
    	session.getTransaction().commit();
    	session.close();
	}

}
