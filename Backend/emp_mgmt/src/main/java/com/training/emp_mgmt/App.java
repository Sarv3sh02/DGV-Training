package com.training.emp_mgmt;

import controllers.DepartmentController;
import controllers.EmployeeController;
import models.Department;
import models.Employee;

public class App 
{
    public static void main( String[] args )
    {
        DepartmentController departmentController=new DepartmentController();
        
//        departmentController.insert(new Department("IT"));
//        departmentController.update(new Department("DEV"),2);
        
        Department department=departmentController.displaySingle(1);
    	
    	EmployeeController employeeController=new EmployeeController();
//    	employeeController.insert(new Employee("Don", 50000, department));
    	
    	employeeController.getSingleEmployee(3);
    	
    	
    		
    	
    }
}
