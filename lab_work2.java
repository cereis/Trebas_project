/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cecib
 */
class Vehicle {
    double milesDriven;
    double gasUsed;

    public Vehicle(double milesDriven, double gasUsed) {
        this.milesDriven = milesDriven;
        this.gasUsed = gasUsed;
    }

    public double calculateMileage() {
        return milesDriven / gasUsed;
    }
}

class Car extends Vehicle {
    
    public Car(double milesDriven, double gasUsed) {
        super(milesDriven, gasUsed);
    }

}

public class lab_work2{
    public static void main(String[] args) {
        Car myCar = new Car(600, 50);
        double mileage = myCar.calculateMileage();
        System.out.println("Your car's gas mileage is " + mileage + " miles per gallon.");
    }
}
