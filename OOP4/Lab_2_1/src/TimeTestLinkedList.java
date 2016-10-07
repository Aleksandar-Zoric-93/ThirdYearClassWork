
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hunter
 */
public class TimeTestLinkedList {
    public static void main(String args[]) throws FileNotFoundException
    {
         
        System.out.println("\n\n\nUsing Linkedlist...");
        
         LinkedList<String> textLinkList = new LinkedList<String>();
         
         Scanner scanner = new Scanner(new File("words_shakespeare.txt"));
         while (scanner.hasNext()){
            textLinkList.add(scanner.next());
            }
            scanner.close();

         
         //Start time of get...
        long startTimeGetLink = System.currentTimeMillis();
        int repsForLink = 10000;
        int quantityForLink = textLinkList.size();
        for(int i = 0; i < repsForLink; i++) {
       
          for(int j = 0; j < quantityForLink; j++)
          {
            textLinkList.get(j);
          }
        }
        
        long endTimeGetLink = System.currentTimeMillis();
        System.out.println("\nThe 'get' took " + (endTimeGetLink - startTimeGetLink) + " milliseconds to execute.");
        //End time of get...
    }
    
}
