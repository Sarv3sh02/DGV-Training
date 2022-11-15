package com.training.FirstHibernate;

import java.util.Scanner;

import controllers.Functionality;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner=new Scanner(System.in);
        int userChoice;
        Functionality function=new Functionality();
        
        do {
        	System.out.println("Enter your choice");
        	System.out.println("1) To add developers");
        	System.out.println("2) To display all developers");
        	System.out.println("3) To display single developer");
        	System.out.println("4) To update data");
        	System.out.println("5) To delete data");
        	System.out.println("6) To sort on the basis of salary");
        	System.out.println("0) To exit");
        	userChoice=scanner.nextInt();
        	scanner.nextLine();

        	
        	switch(userChoice) {
        	case 1:{
        		System.out.println("Enter id");
        		int id=scanner.nextInt();
        		
        		scanner.nextLine();
        		System.out.println("Enter name");
        		String name=scanner.nextLine();
        	
        		System.out.println("Enter age");
        		int age=scanner.nextInt();
        		
        		System.out.println("Enter salary");
        		int salary=scanner.nextInt();
        
        		function.inserting(id,name,age,salary);
        		break;
        	}
        	case 2:{
        		function.displaying();
        		break;
        	}
        	case 3:{
        		System.out.println("Enter the id of developer u want to view");
        		int userId=scanner.nextInt();
        		function.displaySingle(userId);
        		break;
        	}
        	case 4:{
        		System.out.println("Which user you want to update");
        		int user=scanner.nextInt();
        		function.updating(user);
        		break;
        	}
        	case 5:{
        		System.out.println("Enter the id you want to delete");
        		int userId=scanner.nextInt();
        		function.deleting(userId);
        		break;
        	}
        	case 6:{
        		function.sortSalary();
        		break;
        	}
        	default:{
        		System.out.println("You've Exited");
        	}
        	
        	}
        }
        while(userChoice!=0);
        
        scanner.close();
    	       
    }
}
