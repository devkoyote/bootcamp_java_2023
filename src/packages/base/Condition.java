package packages.base;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Quantas horas?");
        hora = sc.nextInt();

        if(hora <= 12) {
            System.out.println("Bom dia!");
        }
        if(hora > 12 || hora <= 18) {
            System.out.println("Boa Tarde!");
        }
        if(hora > 18 || hora <= 24) {
            System.out.println("Boa noite!");
        }

        sc.close();
        
    }
}
