package tests;

import org.junit.Assert;
import org.junit.Test;

import levelUp.StringCalculator;

public class TestCalculator {

    
    @Test
    public final void testAddNull() {
        Assert.assertEquals(StringCalculator.add(""),0);
    }
    
    @Test
    public final void testAddZero() {
        Assert.assertEquals(StringCalculator.add("0"),0);
    }
   
    @Test
    public final void testAddOne() {
        Assert.assertEquals(StringCalculator.add("1"),1);
    }
    
    @Test
    public final void testAddOneAndTwo() {
        Assert.assertEquals(StringCalculator.add("1+2"),3);
    }
    
    @Test
    public final void testAddOneAndTwoAndThree() {
        Assert.assertEquals(StringCalculator.add("1+2+3"),6);
    }
}
