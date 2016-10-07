/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Question_3;

/**
 *
 * @author t00166011
 */

import java.util.*;

public class Die {
    
    private int faceValue;
    
    public Die()
    {
        faceValue = 1;
    }
    
    public int roll()
    {
        faceValue = (int)(Math.random() * 6) + 1;
        return faceValue;
    }
    
    public int getFaceValue()
    {
        return faceValue;
    }
    
}
