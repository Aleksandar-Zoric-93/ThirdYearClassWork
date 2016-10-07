/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author t00166011
 */



public class CircleDriver {
    public static void main(String args[])
    {  
        
        Circle circle = new Circle();
        
        circle.setRadius(6);
        
        System.out.println(String.format("Area of Circle: %.2f",circle.getArea()));
        System.out.println(String.format("\nPerimeter of Circle: %.2f",circle.getPerimeter()));
    }
    
}
