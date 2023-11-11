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

        // recebendo a sobreposição com toString (_product_)
        System.out.println("Dados do produto: " + product);

        System.out.println();
        System.out.print("Entre com o numero de produtos para serem adicionados no estoque: ");
        int quantity = sc.nextInt();
        // passa o metodo addProducts
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Dados atualizados: " + product);

        System.out.println();
        System.out.print("Entre com o numero de produtos para serem removidos no estoque: ");
        quantity = sc.nextInt();
        // chama metodo de remover
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Dados atualizados: " + product);
        
        /*
        System.out.println("| Nome do produto | \n" + product.name + "\n| Preço | \n" + product.price + "\n| Quantidade | \n" + product.quantity);
        */
        sc.close();


    }
}
