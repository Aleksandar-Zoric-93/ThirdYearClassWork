/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hunter
 */
public class BinarySearchTreeMapTest {
    
    public BinarySearchTreeMapTest() {
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
     * Test of put method, of class BinarySearchTreeMap.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        Object k = null;
        Object v = null;
        BinarySearchTreeMap instance = new BinarySearchTreeMap();
        instance.put((Comparable) k, v);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class BinarySearchTreeMap.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        BinarySearchTreeMap instance = new BinarySearchTreeMap();
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class BinarySearchTreeMap.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Object key = null;
        BinarySearchTreeMap instance = new BinarySearchTreeMap();
        Object expResult = null;
        Object result = instance.get((Comparable) key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class BinarySearchTreeMap.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object key = null;
        BinarySearchTreeMap instance = new BinarySearchTreeMap();
        boolean expResult = false;
        boolean result = instance.contains((Comparable) key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of height method, of class BinarySearchTreeMap.
     */
    @Test
    public void testHeight() {
        System.out.println("height");
        BinarySearchTreeMap instance = new BinarySearchTreeMap();
        instance.put("Meg","0874453453");
        instance.put("Rob","0854652781");
        instance.put("Bob","0864325673");
        int expResult = 2;
        int result = instance.height();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class BinarySearchTreeMap.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BinarySearchTreeMap.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
