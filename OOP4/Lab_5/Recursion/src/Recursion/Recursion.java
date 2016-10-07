/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursion;

/**
 *
 * @author t00166011
 */
public class Recursion {
    
    public static int myPow(int x, int y)
    {
            
         if (y == 0) 
         {
            return 1;
         } 
         
         else 
         {
            return x * myPow(x, y - 1);
         }
    }
    
    
    
    public static int binarySearch(int search, int[] array)
    {
        int lower = 0;
        int higher = array.length - 1;
        
         while (lower <= higher) {

         int mid = lower + (higher - lower) / 2;//middle position.

            if(search < array[mid]) 
                higher = mid - 1;

            else if (search > array[mid]) 
                lower = mid + 1;

            else 
             return mid;
    }

    return -1;  
    }
    
    
    
   public static long fibonacciRec(int number)
   {
    if(number<=1) 
        return number;
    else 
        return fibonacciRec(number-1) + fibonacciRec(number-2);
   }
   
   
   
 

    
}
