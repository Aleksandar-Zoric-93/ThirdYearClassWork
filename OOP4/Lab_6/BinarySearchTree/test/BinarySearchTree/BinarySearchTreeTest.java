/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BinarySearchTree;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author t00166011
 */
public class BinarySearchTreeTest {
    
    public BinarySearchTreeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insert method, of class BinarySearchTree.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Object e = null;
        BinarySearchTree instance = new BinarySearchTree();
        instance.insert((Comparable) e);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class BinarySearchTree.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        BinarySearchTree instance = new BinarySearchTree();
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of recursiveContains method, of class BinarySearchTree.
     */
    @Test
    public void testRecursiveContains() {
        System.out.println("recursiveContains");
        String a = "James";
        String b = "Alex";
        String c = "Sean";
        
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(a);
        tree.insert(b);
        tree.insert(c);
        
        boolean expResult = true;
        boolean result = tree.recursiveContains("Sean");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class BinarySearchTree.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        String a = "James";
        String b = "Alex";
        String c = "Sean";
        
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(a);
        tree.insert(b);
        tree.insert(c);
      
        boolean expResult = true;
        boolean result = tree.contains("Alex");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of insertIterative method, of class BinarySearchTree.
     */
    @Test
    public void testInsertIterative() {
        System.out.println("insertIterative");
        String a = "James";
        String b = "Alex";
        String c = "Sean";
        Object e = b;
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(a);
        tree.insert(b);
        tree.insert(c);
        tree.preorderTraversal();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

 
}

