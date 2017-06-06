package levelUp;

public class StringCalculator {
    
    public static int add(final String numbers) {
        int wynik = 0;
        
        if (numbers == "") { return 0; }
        else if (numbers == "0") { return 0; }
        else if (numbers == "1") { return 1; }
        
        else {
            String[] parts = numbers.split("\\+");
            for (String s: parts) {
                int foo = Integer.parseInt(s);
                wynik += foo;
            }
            return wynik;
        }
        
    }
    
}
