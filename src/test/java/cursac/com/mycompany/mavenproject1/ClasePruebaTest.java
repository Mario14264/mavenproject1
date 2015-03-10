/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.com.mycompany.mavenproject1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mario Rodas
 */
public class ClasePruebaTest {
    
    public ClasePruebaTest() {
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
     * Test of metodorueba method, of class ClasePrueba.
     */
    @org.junit.Test
    public void testMetodorueba() {
        System.out.println("metodorueba");
        ClasePrueba instance = new ClasePrueba();
        instance.metodorueba();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sumar method, of class ClasePrueba.
     */
    @org.junit.Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 0;
        int b = 0;
        ClasePrueba instance = new ClasePrueba();
        int expResult = 10;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
