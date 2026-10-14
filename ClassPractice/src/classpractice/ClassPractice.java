/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// QUESTIONS:
// 1) What is the difference between a class and an object?
// A class contains variables and methods that describe how a real-world object behaves. An object can be created from a class and uses the class as a "blueprint" for how it behaves.
// 2) What happens when you pass an object to a print or println method?
// When you pass an object to a print or println method, it will print a list of its important variables.
// 3) What is the scope of a variable in a method? In a class?
// If a variable is declared in a method, it can only be referenced within that method. If it is declared at the Class level, it can be referenced anywhere in the program.

import java.text.DecimalFormat;

/**
 *
 * @author acena2028
 */
public class ClassPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // CONTROL
        Car carControl = new Car();
        System.out.println(carControl);
        
        // instantiate Car objects with carBrand VW Bug, Toyota Prius, BMW i8, and Tesla Model 3
        // give each object appropriate enginePower, maxSpeed, and price values
        Car car1 = new Car(), car2 = new Car(), car3 = new Car(), car4 = new Car();
        
        car1.setCarBrand("VW Bug");
        car2.setCarBrand("Toyota Prius");
        car3.setCarBrand("BMW i8");
        car4.setCarBrand("Tesla Model 3");
        
        car1.setEnginePower(174);
        car2.setEnginePower(195);
        car3.setEnginePower(369);
        car4.setEnginePower(283);
        
        car1.setMaxSpeed(120);
        car2.setMaxSpeed(115);
        car3.setMaxSpeed(155);
        car4.setMaxSpeed(124.9);
        
        car1.setPrice(23000);
        car2.setPrice(34000);
        car3.setPrice(155000);
        car4.setPrice(38000);
        
        // print details out (use toString method in Car class)
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }
    
}

class Car {
    // declare variables
    String carBrand;
    int enginePower; // in Horse Power
    double maxSpeed; // in MPH
    double price; // in $
    
    // Constructor: create a base car
    public Car() {
        carBrand = "Base";
        enginePower = 200;
        maxSpeed = 100.;
        price = 50000.;
    }
    
    // Set the brand of the car
    public void setCarBrand(String brand) {
        carBrand = brand;
    }
    
    // Set the engine power of the car
    public void setEnginePower(int power) {
        enginePower = power;
    }
    
    // Set the max speed of the car
    public void setMaxSpeed(double speed) {
        maxSpeed = speed;
    }
    // Set the price of the car
    public void setPrice(double cost){
        price = cost;
    }
    // Get the brand of the car
    public String getCarBrand() {
        return carBrand;
    }
    // Get the engine power of the car
    public int getEnginePower() {
        return enginePower;
    }
    // Get the max speed of the car
    public double getMaxSpeed() {
        return maxSpeed;
    }
    // Get the price of the car
    public double getPrice() {
        return price;
    }
    // Returns a string representation of the car's information
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        String values = ("Car brand: " + carBrand + 
        "\nEngine power: " + enginePower + 
        "hp\nMax speed: " + maxSpeed + 
        " mph\nPrice: $" + df.format(price) + "\n");
        return values;
    }
    
}