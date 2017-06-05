package junit;

import org.junit.Test;

public class TimeoutTest {

    @Test(timeout=2000)
    public void test() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
    }
}
