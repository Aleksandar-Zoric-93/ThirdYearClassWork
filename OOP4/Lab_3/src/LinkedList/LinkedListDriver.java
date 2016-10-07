/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LinkedList;

/**
 *
 * @author t00166011
 */
public class LinkedListDriver {
    public static void main(String[] args) {
        
        CP3LinkedList<String> names = new CP3LinkedList();
        
        names.addFirst("Joe");
        names.addFirst("Bobby");
        names.print();
        
        System.out.println("Current Size: " + names.size());
    }
    
}
