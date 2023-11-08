package packages.base;

import java.util.Locale;
import java.util.Scanner;

import packages.oob.entities.Triangle;

public class Program {
    public static void main(String[] args) {
        // Configurar o idioma local _US_
        Locale.setDefault(Locale.US);

        // Configurar variaveis de medida para triangulo
        //double xA, xB, xC, yA, yB, yC;

        // chamada por OOBJ
        Triangle x, y;

        // instanciar os objetos criados
        x = new Triangle();
        y = new Triangle();

        // Utilizar classe Scanner para capturar dados
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores do triangulo em X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite os valores do triangulo em Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        // função que calcula area
        double areaX = x.area();
        
        //função que calcula area 
        double areaY = y.area();

        // imprimi o valor dos triangulo
        System.out.printf("Area do triangulo em X: %.4f%n", areaX);

        System.out.printf("Area do triangulo em Y: %.4f%n", areaY);

        // mostra qual a maior area do triangulo
        if (areaX > areaY) {
            System.out.println("A area X do triangulo é maior: ");
        } else {
            System.out.println("A area Y do triangulo é maior");
        }

        // Fechar a classe Scanner depois de usar
        sc.close();

    }
}
