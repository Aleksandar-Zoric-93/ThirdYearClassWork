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
 * @author t00166011
 */
public class CircleTest {
    
    public CircleTest() {
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
//     * Test of setRadius method, of class Circle.
//     */
    @Test
    public void testSetRadius() {
        System.out.println("setRadius");
        double r = 10.0;
        Circle instance = new Circle();
        instance.setRadius(r);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
  }

    /**
     * Test of getArea method, of class Circle.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Circle instance = new Circle();
        double expResult = 314.0;
        double result = instance.getArea();
        assertEquals(expResult, result, 1.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPerimeter method, of class Circle.
     */
    @Test
    public void testGetPerimeter() {
        System.out.println("getPerimeter");
        Circle instance = new Circle();
        double expResult = 0.0;
        double result = instance.getPerimeter();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
