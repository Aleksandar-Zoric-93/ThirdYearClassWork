/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Question_2;

/**
 *
 * @author t00166011
 */
public class CarDriver {
    public static void main(String args[])
    {
        Car car = new Car(12);
        
        car.addFuel(50);
        car.drive(90);
        
        System.out.println(String.format("Fuel in the tank: %.2f ",car.getFuel()));
        
    }
    
}
