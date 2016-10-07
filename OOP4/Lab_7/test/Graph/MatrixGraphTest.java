/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

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
public class MatrixGraphTest {
    
    public MatrixGraphTest() {
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
     * Test of isEdge method, of class MatrixGraph.
     */
    @Test
    public void testIsEdge() {
        System.out.println("isEdge");
        int source = 0;
        int dest = 0;
        MatrixGraph instance = null;
        boolean expResult = false;
        boolean result = instance.isEdge(source, dest);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class MatrixGraph.
     */
    @Test
    public void testInsert() {
        //undirectedGraph
        System.out.println("insert");
        MatrixGraph graph = new MatrixGraph(5,true);
        Edge edge = new Edge(0,1);
        graph.insert(edge);
        boolean actual = graph.isEdge(0, 1);
        boolean expected = true;
        assertEquals(actual,expected);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
      
        
    }

    /**
     * Test of remove method, of class MatrixGraph.
     */
    @Test
    public void testRemove() {
       //undirectedGraph
        System.out.println("remove");
        MatrixGraph graph = new MatrixGraph(5,true);
        Edge edge = new Edge(0,1);
        graph.insert(edge);
        graph.remove(edge);
        boolean actual = !graph.isEdge(0,1);
        boolean expected = true;
        assertEquals(actual,expected);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of breadthFirstTraversal method, of class MatrixGraph.
     */
    @Test
    public void testBreadthFirstTraversal() {
        System.out.println("breadthFirstTraversal");
        int start = 0;
        MatrixGraph instance = null;
        instance.breadthFirstTraversal(start);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of depthFirstTraversal method, of class MatrixGraph.
     */
    @Test
    public void testDepthFirstTraversal() {
        System.out.println("depthFirstTraversal");
        int start = 0;
        MatrixGraph instance = null;
        instance.depthFirstTraversal(start);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
