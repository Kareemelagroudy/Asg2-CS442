/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.operator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kokye
 */
public class OperatorTest {
    
    public OperatorTest() {
    }
    

    /**
     * Test of main method, of class Operator.
     */
    @Test
    public void testsub(){
        System.out.println("sub");
        int a=5;
        int b=3;
        Operator instance=new Operator();
        int result=instance.sub(a, b);
        assertEquals(2,result);
    }
    @Test
    public void testdivide(){
        System.out.println("divide");
        int a=9;
        int b=3;
        Operator instance=new Operator();
        int result=instance.divide(a, b);
        assertEquals(3,result);
    }
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Operator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
