package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionsTest {
    
    @Test
    public void test() {
        //given
        int a = 34;
        int b = 3;
        //when
        int c = a % b;
        //then
        String str1="Capgemini";
        String str2="Capgemini";
        String str3=null;
        
        assertTrue(c == 1);
        assertFalse(c == 125);
        assertEquals(str1,str2);
        assertNull(str3);
        assertNotNull(str2);
        
    }
    
}
