package packages.project2;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Chama a classe 
        Product product = new Product();

        System.out.println("Entre com dados do produtos: ");

        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Preço: ");
        product.price = sc.nextDouble();
        System.out.println("Quantidade no estoque: ");
        product.quantity = sc.nextInt();
        System.out.println("| Nome do produto | \n" + product.name + "\n| Preço | \n" + product.price + "\n| Quantidade | \n" + product.quantity);

        sc.close();


    }
}
