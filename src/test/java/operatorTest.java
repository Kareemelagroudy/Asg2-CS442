/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.junit_test.operator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Khalegy
 */
public class operatorTest {
    
    public operatorTest() {
    }
    @Test
    public void testsum()
    {
        System.out.println("sum  int a=2");
        int b =3;
        operator instance = new operator();
        int result = instance.sum(2,b);
        assertEquals(result,5);
    }
     @Test
    public void testmult()
    {
        System.out.println("mult  int a=5");
        int b =3;
        operator instance = new operator();
        int result = instance.mult(5,b);
        assertEquals(result,15);
    }
    
    

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
