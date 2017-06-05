package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationsTest {
    @BeforeClass
    public static void runBeforeClassTestMethod() {
        System.out.println("@BiforKlas - jadymy na bigiel!");
    }   
    
    @AfterClass
    public static void runAfterClassTestMethod() {
        System.out.println("@AfterClass - runAfterClassTestMethod");
    }
    @Before 
    public void runBeforeTestMethod() {
        System.out.println("@Bifor - jadymy na bigiel!");
    }   
        
    @After 
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }    
    @Test 
    public void testingTestMethod() {
        System.out.println("@testingTest - runAfterTestMethod");
    }       
    @Test 
    public void notTestingTestMethod() {
        System.out.println("@notTestingTest - runAfterTestMethod");
    }  
    @Test 
    public void justCheckingTestMethod() {
        System.out.println("@justChecking - runAfterTestMethod");
    }  
    
    @Ignore
    public void thisTestWillBeIgnored() {
        System.out.println("@Ignore - nołbady kiers!");
    }    
}
