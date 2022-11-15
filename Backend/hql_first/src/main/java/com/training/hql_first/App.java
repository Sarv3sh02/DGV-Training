package com.training.hql_first;

import controllers.CarController;
import models.Car;

public class App 
{
    public static void main( String[] args )
    {
        CarController carController=new CarController();
//        carController.insert(new Car("McLaren","765LT",600000));
        carController.update(new Car("McLaren","P1",800000),3);
        
    }
}
