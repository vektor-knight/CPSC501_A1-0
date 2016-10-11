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
public class PersonNumberTest {
    
    public PersonNumberTest() {
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

    /**
     * Test of getTelephoneNumber method, of class PersonNumber.
     */
    @Test
    public void testGetTelephoneNumber() {
        System.out.println("getTelephoneNumber");
        PersonNumber instance = new PersonNumber();
        String expResult = "(403) 2071307";
        String result = instance.getTelephoneNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOfficeAreaCode method, of class PersonNumber.
     */
    @Test
    public void testGetOfficeAreaCode() {
        System.out.println("getOfficeAreaCode");
        // Apply same change here to reflect Refactor 1 (Rename Class)
        Person instance = new Person();
        String expResult = "403";
        String result = instance.getOfficeAreaCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOfficeAreaCode method, of class PersonNumber.
     */
    @Test
    public void testSetOfficeAreaCode() {
        System.out.println("setOfficeAreaCode");
        String arg = "403";
        PersonNumber instance = new PersonNumber();
        instance.setOfficeAreaCode(arg);
    }

    /**
     * Test of getOfficeNumber method, of class PersonNumber.
     */
    @Test
    public void testGetOfficeNumber() {
        System.out.println("getOfficeNumber");
        // Updating class object to reflect Refactor 1
        Person instance = new Person();
        String expResult = "2071307";
        String result = instance.getOfficeNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOfficeNumber method, of class PersonNumber.
     */
    @Test
    public void testSetOfficeNumber() {
        System.out.println("setOfficeNumber");
        String arg = "2071307";
        // Updating class object to reflect Refactor 1
        Person instance = new Person();
        instance.setOfficeNumber(arg);
    }
    
}
