/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursion;

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
public class RecursionTest {
    
    public RecursionTest() {
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
     * Test of myPow method, of class Recursion.
     */
    @Test
    public void testMyPow() {
        System.out.println("myPow");
        int x = 0;
        int y = 0;
        int expResult = 0;
        int result = Recursion.myPow(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of binarySearch method, of class Recursion.
     */
    @Test
    public void testBinarySearch() {
        System.out.println("binarySearch");
        int search = 9;
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 4;
        array[2] = 7;
        array[3] = 9;
        array[4] = 44;
        int expResult = 3;
        int result = Recursion.binarySearch(search, array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of fibonacciRec method, of class Recursion.
     */
    @Test
    public void testFibonacciRec() {
        System.out.println("fibonacciRec");
        int number = 0;
        long expResult = 0L;
        long result = Recursion.fibonacciRec(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
