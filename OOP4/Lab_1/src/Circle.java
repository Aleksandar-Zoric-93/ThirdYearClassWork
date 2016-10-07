/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author t00166011
 */
import java.util.*;

public class Circle {
    
    private double radius = 0;
    
    public void setRadius(double r)
    {
        radius = r;
    }
    
    
    
    public double getArea()
    {
       double res = 0;
       res = Math.PI *(radius*radius);
       
       return res;
    }
    
    public double getPerimeter()
    {
        double res = 0;
        res = 2*Math.PI*radius;
        
        return res;
    }
    
}
