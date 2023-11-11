package packages.base;

import java.util.Scanner;

public class ScannerData {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String x;
        // active scanner keyboard
        x = sc.next();
        System.out.println("Você digitou: "+x);
        // close function capture keyboard
        sc.close();

    }
}
