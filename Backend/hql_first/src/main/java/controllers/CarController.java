package controllers;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Car;

public class CarController {
	
	Configuration configuration;
	Session session;
	SessionFactory sessionFactory;
	
	public CarController(){
		
		configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		sessionFactory=configuration.buildSessionFactory();
	}
	
	public void insert(Car car) {
		
		session=sessionFactory.openSession();
		session.beginTransaction();
    	session.save(car);
    	session.getTransaction().commit();
		session.close();
	}
	
	public void delete(int id) {
		
		session=sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("delete from Car where id= :id");
		query.setParameter("id", id);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}
	
	public void displayAll() { 
		
		session=sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Car");
		
		List<Car> cars =  query.getResultList();
		for(Car car : cars){
			System.out.println(car.getName()+" "+car.getModel()+" "+car.getPrice());
		}
		session.getTransaction().commit();
		session.close();
	}
	
   public void displayByName(String name) {
	   
	   session=sessionFactory.openSession();
	   Query query = session.createQuery("from Car where name= :name");
		query.setParameter("name", name);
		Car car = (Car) query.getSingleResult();
		System.out.println(car.getName()+" "+car.getModel()+" "+car.getPrice());
		session.close();
	}
   
    public void displayById(int id) {
    	
    	session=sessionFactory.openSession();
    	Query query = session.createQuery("from Car where id= :id");
		query.setParameter("id", id);
		Car car = (Car) query.getSingleResult();
		System.out.println(car.getName()+" "+car.getModel()+" "+car.getPrice());
		session.close();
  }
    
    public void update(Car car,int id) {
    	
    	session=sessionFactory.openSession();
    	session.beginTransaction();
    	Query query = session.createQuery("update Car set model= :model where id= :id");
		query.setParameter("model", car.getModel());
		query.setParameter("id", id);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
    }

}
