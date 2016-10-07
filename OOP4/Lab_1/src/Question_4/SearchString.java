/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question_4;

/**
 *
 * @author Hunter
 */

import java.util.*;

public class SearchString {
    
    public static int search(String[] stringList, String searchString)
    {
    
        for(String s: stringList){
		if(s.equals(searchString))
			return Arrays.asList(stringList).indexOf(searchString);


	}
	return -1;
                        
       
    }
    
}
