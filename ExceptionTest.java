package junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ExceptionTest {
    
    @Test(expected = ArithmeticException.class)
    public void CalculatorTestDivisionByZero(){
        // given 
        int i = 23;
        // when
        i = i / 0;
        System.out.println("i=" + i);
        // then
    }  
    
    @Test(expected = NullPointerException.class)
    public void testEmptyArrayGetMethod() {
        ArrayList<String> testList = null;
        assertFalse(testList.isEmpty());
    } 
    
    @Test(expected = NullPointerException.class)
    public void testNotInitiatedObjectMethod() {
        // System.out.println("@testingTest - runAfterTestMethod");
        String a = null;
        assertEquals(a.substring(2,3), a);
        
    } 
}

