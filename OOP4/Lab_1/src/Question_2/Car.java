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
public class Car {
    
    private double fuelEff = 0;
    private double tankFuel = 0;
    
    public Car(double efficency)
    {
        fuelEff = efficency;
    }
    
    public double drive(double distance)
    {
        tankFuel = tankFuel - distance / fuelEff;
        return tankFuel;
    }
    
    public double addFuel(double fuel)
    {
        tankFuel += fuel;
        return tankFuel;
    }
    
    public double getFuel()
    {
        return tankFuel;
    }
    
}
