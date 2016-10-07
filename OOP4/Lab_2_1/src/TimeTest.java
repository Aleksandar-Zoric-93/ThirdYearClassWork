
import java.io.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author t00166011
 */
public class TimeTest {
    public static void main(String[] args) throws FileNotFoundException
    {
    ArrayList<String> textArrayList = new ArrayList<String>();
      
    Scanner s = new Scanner(new File("words_shakespeare.txt"));
    while (s.hasNext()){
    textArrayList.add(s.next());
    }
    s.close();
     
    System.out.println("Using Arraylist...");
    
    
    
        //Start time of get...
        long startTimeGet = System.currentTimeMillis();
        int reps = 10000;
        int quantity = textArrayList.size();
        for(int i = 0; i < reps; i++) {
       
          for(int j = 0; j < quantity; j++)
          {
            textArrayList.get(j);
          }
        }
        
        long endTimeGet = System.currentTimeMillis();
        System.out.println("\nThe 'get' took " + (endTimeGet - startTimeGet) + " milliseconds to execute.");
        //End time of get...
        
        
        
        //start of iteration
        long startTimeForIterator = System.currentTimeMillis();
        for(int i = 0; i < reps; i++) { 
	Iterator it = textArrayList.iterator();  
        while(it.hasNext())
	     it.next();
    }
         long endTimeForIterator = System.currentTimeMillis();
         System.out.println("\nThe 'iterator' took " + (endTimeForIterator - startTimeForIterator) + " milliseconds to execute.");
         //end of iteration
         
         
         //start of insert
        long startTimeForInsert = System.currentTimeMillis();
        int half = textArrayList.size()/2;
        String string = "test";
        ListIterator it = textArrayList.listIterator(half);
            
        for(int i = 0; i < reps * 10; i++)
        it.add(string);
        long endTimeForInsert = System.currentTimeMillis();
        System.out.println("\nThe 'insert' took " + (endTimeForInsert - startTimeForInsert) + " milliseconds to execute.");
        //end of insert
        
        
        //start of remove
        long startTimeForRemove = System.currentTimeMillis();
        ListIterator iterate = textArrayList.listIterator(3);
        while(it.hasNext()) {
            iterate.next();
            iterate.remove();
        }
        long endTimeForRemove = System.currentTimeMillis();
        System.out.println("\nThe 'remove' took " + (endTimeForRemove - startTimeForRemove) + " milliseconds to execute.");
        //end of remove
        
        
        
        
        
        
       


    }

}

  
    





