/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsc501_a1.pkg0;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shshunda
 */
public class PersonTest {
    
    public PersonTest() {
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
     * Test of getName method, of class PersonNumber.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        // Refactor 1: Change class object to reflect
        // results of "Rename Class"
        Person instance = new Person();
        String expResult = "Bob";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
}