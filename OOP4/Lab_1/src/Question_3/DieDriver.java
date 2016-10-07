/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_3;

/**
 *
 * @author Hunter
 */
public class DieDriver {
    public static void main(String[] args)
    {
        Die die = new Die();
        
        System.out.println("Rolling the dice..." + die.roll());
         System.out.println("\nCurrent face on the die is: " + die.getFaceValue());
    }
    
}
