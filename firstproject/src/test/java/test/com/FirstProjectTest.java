/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import com.itexps.edu.firstproject.FirstProject;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author beyhan
 */
public class FirstProjectTest {
    FirstProject firstproject;
    
    
    public FirstProjectTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        firstproject = new FirstProject();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
   @Test
    public void testFirstProject() {
        firstproject = new FirstProject(); 
            firstproject.setId(1);
            firstproject.setName("jenkins");
    
           assertEquals(1, firstproject.getId());
           assertEquals("jenkins", firstproject.getName());
    

}
    @Test
    public void testFirstProjectEmployees() {
        firstproject = new FirstProject(); 
            firstproject.getEmployeeList().add("Beyhan");
            firstproject.getEmployeeList().add ("Selin");
    
           assertEquals(2, firstproject.getEmployeeList().size());
           assertEquals("Beyhan", firstproject.getEmployeeList().get(0));

}
 
}
