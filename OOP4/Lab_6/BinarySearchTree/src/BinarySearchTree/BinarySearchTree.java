package BinarySearchTree;

import java.lang.reflect.Array;
import java.util.Deque;
import java.util.LinkedList;

/**
   This class implements a binary search tree whose
   nodes hold objects that implement the Comparable
   interface.
*/

public class BinarySearchTree<E extends Comparable<E>> {
   private Node root;

    void preorderTraversal(Comparable comparable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   public class Node
   {
      public E data;
      public Node left;
      public Node right;
   }
   
   public BinarySearchTree(){
     root = null;
   }
   
   public void insert(E e) {
      Node newNode = new Node();
      newNode.data = e;
      newNode.left = null;
      newNode.right = null;
      if (root == null)
        root = newNode;
      else
        insertSub(root, newNode);
   }
       
   private void insertSub(Node node, Node newNode){
      if (newNode.data.compareTo(node.data) < 0)
      {  if (node.left == null)
            node.left = newNode;
         else
            insertSub(node.left,newNode);
      }
      else
      {  if (node.right == null) 
            node.right = newNode;
         else
            insertSub(node.right, newNode);
      }
   }
   
   
 
   public void print(){
       if (root != null)
         printSub(root);
         printSubPreorder(root);
         printSubPostorder(root);
   }
   
   
   
   private void printSub(Node node){
      if (node != null)
      {
         printSub(node.left);
         System.out.println(node.data);
         printSub(node.right);
      }
   }   
   
  
public boolean recursiveContains(E element) 
{
    if (root == null) {
        return false;
    } else {
        return recursiveContainsSub(root, element);
    }  
}


   
   private boolean recursiveContainsSub(Node node, E element){
       
       if (node == null) {
           return false;
       } 
       
       
       else 
       {
           if (node.data.equals(element)) {
               return true;
           } else if (node.data.compareTo(element) < 0) {
               return recursiveContainsSub(node.right, element);
           } else {
               return recursiveContainsSub(node.left, element);
           }
       }
        
     
   }
   
 
  
   
   public boolean contains(E element)
   {
       Node current = root;

       while (current != null) {
           int result = current.data.compareTo(element);

           if (result == 0) {
               return true;
           } else if (result < 0) {
               current = current.right;
           } else {
               current = current.left;
           }
       }

       return false;
   }
   
   private void printSubPreorder(Node node){
      if (node != null)
      {
         System.out.println(node.data);
         printSubPreorder(node.left);
         printSubPreorder(node.right);
      }
   }   
   
   
   private void printSubPostorder(Node node){
      if (node != null)
      {
         printSubPostorder(node.left);       
         printSubPostorder(node.right);
         System.out.println(node.data);
      }
   } 
   
   public void insertIterative(E e)
   {
       Node newNode = new Node();
       newNode.data = e;
       newNode.left = null;
       newNode.right = null;

       while (root != null) 
       {
           if (newNode.data.compareTo(newNode.data) < 0) 
           {
               if (newNode.left == null) 
               {
                   newNode.left = newNode;
               }
           } 
           else 
           {
               if (newNode.right == null) 
               {
                   newNode.right = newNode;
               }

           }
           root = newNode;
       
       }  
}
   
    public void preorderTraversal()
   {
       Deque<Node> stack = new LinkedList();
       
       
       stack.addFirst(root); 
       
       while(!stack.isEmpty())
       {
           Node poppedOffStack = stack.removeFirst();
           System.out.println(poppedOffStack.data);
           
           
           if (poppedOffStack.right != null) {
               stack.addFirst(poppedOffStack.right);
           } else if (poppedOffStack.left != null) {
               stack.addFirst(poppedOffStack.left);
           }
           
        } 
       
   }
       
   }
