package controllers;

import java.util.List;
import java.util.Scanner;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Developers;

public class Functionality {
	
	Configuration configuration;
	Session session;
	SessionFactory sessionFactory;
	Scanner scanner=new Scanner(System.in);

	
	public Functionality()
	{
		configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Developers.class);
		sessionFactory=configuration.buildSessionFactory();
	}
	
	public void inserting(int id,String name,int age,int salary) {
    	    	
		session=sessionFactory.openSession();
    	Developers dev=new Developers(id,name,age,salary);
    	session.beginTransaction();
    	session.save(dev);
    	session.getTransaction().commit();
		session.close();
	}
	
	public void displaying() {
		
		session=sessionFactory.openSession();
    	CriteriaQuery<Developers> criteriaQuery=session.getCriteriaBuilder().createQuery(Developers.class);
    	criteriaQuery.from(Developers.class);
    	
    	List<Developers> dev=session.createQuery(criteriaQuery).getResultList();
    	
    	for(Developers devp:dev) {
    		System.out.println(devp.getName()+" "+devp.getAge()+" "+devp.getSalary());
    	}
    	session.close();
	}
	
	public void displaySingle(int userId) {
		
		session=sessionFactory.openSession();
		Developers dev=(Developers)session.get(Developers.class,userId);
    	System.out.println(dev.getName()+" "+dev.getAge()+" "+dev.getSalary());
    	session.close();
	}
	
	public void updating(int user) {
		
		session=sessionFactory.openSession();
		Developers dev=(Developers)session.get(Developers.class,user);
		
		System.out.println("What do you want to update 1)Name 2)Age 3)Salary");
		int choice=scanner.nextInt();
		scanner.nextLine();
		
		if(choice==1) {
			System.out.println("What value you want to give");
			String name=scanner.nextLine();
			dev.setName(name);
			session.beginTransaction();
	    	session.update(dev);
	    	session.getTransaction().commit();
		}
		
		else if(choice==2) {
			System.out.println("What value you want to give");
			int age=scanner.nextInt();
			dev.setAge(age);
			session.beginTransaction();
	    	session.update(dev);
	    	session.getTransaction().commit();
		}
		
		else if(choice==3) {
			System.out.println("What value you want to give");
			int salary=scanner.nextInt();
			dev.setSalary(salary);
			session.beginTransaction();
	    	session.update(dev);
	    	session.getTransaction().commit();
	   		}	
		
		session.close();
	}
	
	public void deleting(int userId) {
		
		session=sessionFactory.openSession();
    	Developers dev=(Developers)session.get(Developers.class,userId);
    	session.beginTransaction();
    	session.delete(dev);
    	session.getTransaction().commit();
    	session.close();
	}
	
	public void sortSalary() {
		
		session=sessionFactory.openSession();
		CriteriaQuery<Developers> criteriaQuery=session.getCriteriaBuilder().createQuery(Developers.class);
		Root<Developers> root = criteriaQuery.from(Developers.class);
		
		criteriaQuery.from(Developers.class);
		
		criteriaQuery.orderBy(session.getCriteriaBuilder().asc(root.get("salary")));
		
		List<Developers> dev=session.createQuery(criteriaQuery).getResultList();
		
    	for(Developers devp:dev) {
    		System.out.println(devp.getName()+" "+devp.getAge()+" "+devp.getSalary());
    	}
    	session.close();
	}
	
}
