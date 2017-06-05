package levelup.java;

public class MathUtils {
    public static long addPositive( int a, int b ) {
        if ((a<0) || (b<0))  { throw new UnsupportedOperationException("Both integers must be > 0"); }
        else { return a+b; }
    }
}
