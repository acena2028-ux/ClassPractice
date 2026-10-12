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

package classpractice;

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
        Car carControl;
        carControl = new Car();
        System.out.println(carControl);
        
        // instantiate Car objects with carBrand VW Bug, Toyota Prius, BMW i8, and Tesla Model 3
        
        // give each object appropriate enginePower and maxSpeed values
        
        // print details out (use toString method in Car class)
        
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
        maxSpeed = 100.0;
        price = 50000.00;
    }
    
    // Set the brand of the car
    
    // Set the engine power of the car
    
    // Set the max speed of the car
    
    // Set the price of the car
    
    // Get the brand of the car
    
    // Get the engine power of the car
    
    // Get the max speed of the car
    
    // Get the price of the car
    
    // Returns a string representation of the car's information
    
    
}