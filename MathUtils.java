package junit;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import levelup.java.MathUtils;
import static org.hamcrest.CoreMatchers.is;

@RunWith(value = Parameterized.class)
public class MathUtilsTest {

    private int numberA;
    private int numberB;
    private long expected;

    // Inject via constructor
    // for {8, 2, 10}, numberA = 8, numberB = 2, expected = 10
    public MathUtilsTest(int numberA, int numberB, long expected) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }
    
    @Parameters(name = "{index}: testAdd({0}+{1}) = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {2, 2, 4},
                {8, 2, 10},
                {4, 5, 9},
                {5, 5, 10}
        });
    }    

    @Test
    public void test_addTwoNumbes() {
        assertThat(MathUtils.addPositive(numberA, numberB), is(expected));
    }
    
//    @Test
//    public void  test_negativeNumbers() {
//        assertEquals(MathUtils.addPositive(-10, 12), 2);
//    }
}
