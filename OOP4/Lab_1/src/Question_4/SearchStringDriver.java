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
public class SearchStringDriver {
    public static void main(String[] args)
    {
        SearchString searchString = new SearchString();
        
         String input = "c";
        String[] myStringArray = new String[]{"a","b","c","d","e"};
       
        int result;
        result = searchString.search(myStringArray,input);
       
        if(result != -1)
        System.out.println("The string '" + input + "' is in the array at subscript " + result);
        else
             System.out.println("The string '" + input + "' is not the array,sorry");
            
        
    }
    
}
