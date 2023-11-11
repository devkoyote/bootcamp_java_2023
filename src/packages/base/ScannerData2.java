package packages.base;

import java.util.Locale;
import java.util.Scanner;
public class ScannerData2 {
    public static void main(String[] args) {
        // config local
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        char x;
        // capture first caracter
        x = sc.next().charAt(0);
        System.out.println("Voce digitou: "+x);

        sc.close();


    }
}
