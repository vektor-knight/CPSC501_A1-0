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
public class TelephoneNumberTest {
    
    public TelephoneNumberTest() {
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelephoneNumber method, of class TelephoneNumber.
     */
    @Test
    public void testGetTelephoneNumber() {
        System.out.println("getTelephoneNumber");
        TelephoneNumber instance = new TelephoneNumber();
        String expResult = "";
        String result = instance.getTelephoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOfficeAreaCode method, of class TelephoneNumber.
     */
    @Test
    public void testGetOfficeAreaCode() {
        System.out.println("getOfficeAreaCode");
        TelephoneNumber instance = new TelephoneNumber();
        String expResult = "";
        String result = instance.getOfficeAreaCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOfficeAreaCode method, of class TelephoneNumber.
     */
    @Test
    public void testSetOfficeAreaCode() {
        System.out.println("setOfficeAreaCode");
        String arg = "";
        TelephoneNumber instance = new TelephoneNumber();
        instance.setOfficeAreaCode(arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOfficeNumber method, of class TelephoneNumber.
     */
    @Test
    public void testGetOfficeNumber() {
        System.out.println("getOfficeNumber");
        TelephoneNumber instance = new TelephoneNumber();
        String expResult = "";
        String result = instance.getOfficeNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOfficeNumber method, of class TelephoneNumber.
     */
    @Test
    public void testSetOfficeNumber() {
        System.out.println("setOfficeNumber");
        String arg = "";
        TelephoneNumber instance = new TelephoneNumber();
        instance.setOfficeNumber(arg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
