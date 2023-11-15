package packages.project3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Rectangle rec = new Rectangle();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura do retangulo: ");
        rec.width = sc.nextDouble();
        System.out.println("Digite a altura do retangulo");
        rec.height= sc.nextDouble();
              
         
        System.out.println();
        System.out.printf("O valor da area calculado é: %.2f", rec.Area());
        System.out.println();
        System.out.printf("O valor do perimetro calculado é: %.2f", rec.Perimeter());
        System.out.println();
        System.out.printf("O valor diagonal é: %.2f", rec.Diagonal());
        // fechamento do scanner
        sc.close();

    }
}
