/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stacks;

import java.util.Deque;
import java.util.LinkedList;



/**
 *
 * @author t00166011
 */
public class Stack {
    
   
    public boolean isBalanced(String expression)
    {
        boolean balanced = true;
        int index = 0;
        char nextChar;
        
        Deque<Character> stackOfCharacters = new LinkedList();
        
       
        
        while(balanced && index < expression.length())
        {
            nextChar = expression.charAt(index);
            
            if(nextChar == '(')
            {
                stackOfCharacters.addFirst(nextChar);
            }
            
            else if(nextChar == ')')
            {
                if(stackOfCharacters.isEmpty())
                {
                    balanced = false;
                }
                else
                {
                    char checkFirst = stackOfCharacters.getFirst();
                    stackOfCharacters.removeFirst();
                    
                    if(matching(checkFirst, nextChar))
                    {
                        balanced = true;
                    }
                    stackOfCharacters.removeFirst();
                    if(stackOfCharacters.peek() != ')')
                    {
                        balanced = false;
                    }
                }
            }
            
        }
        
         index++;
        
        if(balanced && stackOfCharacters.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
   
    
    private static boolean matching(char ch1, char ch2)
    {
        if(ch1 == '(' && ch2 == ')' || ch1 == '[' && ch2 == ']' || ch1 == '{' && ch2 == '}')
        {
            return true;
        }
        
        else
        { 
            return false;
        }
        
    }
       
       
      
      
       
       
        
    
    
   
    
    
    
    
}
