package packages.project4;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        emp.name = sc.nextLine();
        System.out.println();
        System.out.println("Digite o salario bruto: ");
        emp.grossSalary = sc.nextDouble();
        System.out.println();
        System.out.println("Digite o valor do imposto pago: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Passe porcentagem para a correção salarial ser recalculada: ");
        double perc = sc.nextDouble();
        // calcula porcentagem e soma ao salario
        emp.increaseSalary(perc);
        // calcula o imposto a ser cobrado
        emp.netSalary();

        System.out.println();
        // returna resultado
        System.out.println("Dados atualizados do funcionário: " + emp);
        


        sc.close();

    }
}
