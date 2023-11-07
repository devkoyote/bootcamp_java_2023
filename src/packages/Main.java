package packages;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Types primitives
        int y= 21;
        double dolar = 23.34532;
        // Out data
        System.out.println(y);
        System.out.printf("Resultado %.2f%n", dolar);
        // Config o type language
        Locale.setDefault(Locale.US);
    }    
}
