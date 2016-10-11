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
        PersonNumber instance = new PersonNumber();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelephoneNumber method, of class PersonNumber.
     */
    @Test
    public void testGetTelephoneNumber() {
        System.out.println("getTelephoneNumber");
        PersonNumber instance = new PersonNumber();
        String expResult = "";
        String result = instance.getTelephoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOfficeAreaCode method, of class PersonNumber.
     */
    @Test
    public void testGetOfficeAreaCode() {
        System.out.println("getOfficeAreaCode");
        PersonNumber instance = new PersonNumber();
        String expResult = "";
        String result = instance.getOfficeAreaCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOfficeAreaCode method, of class PersonNumber.
     */
    @Test
    public void testSetOfficeAreaCode() {
        System.out.println("setOfficeAreaCode");
        String arg = "";
        PersonNumber instance = new PersonNumber();
        instance.setOfficeAreaCode(arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOfficeNumber method, of class PersonNumber.
     */
    @Test
    public void testGetOfficeNumber() {
        System.out.println("getOfficeNumber");
        PersonNumber instance = new PersonNumber();
        String expResult = "";
        String result = instance.getOfficeNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOfficeNumber method, of class PersonNumber.
     */
    @Test
    public void testSetOfficeNumber() {
        System.out.println("setOfficeNumber");
        String arg = "";
        PersonNumber instance = new PersonNumber();
        instance.setOfficeNumber(arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
