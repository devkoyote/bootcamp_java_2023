package packages.project5;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        

        Aluno al = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        al.name = sc.nextLine();
        System.out.println();

        System.out.println("Digite a sua primeira nota: ");
        al.note1 = sc.nextDouble();
        System.out.println();
        System.out.println("Digite a sua segunda nota: ");
        al.note2 = sc.nextDouble();
        System.out.println();
        System.out.println("Digite a sua terceira nota: ");
        al.note3 = sc.nextDouble();
        System.out.println();

        if (al.notas() >= 60) {
            System.out.println(" " + al + " Passou de ano");
        } else {
            System.out.println(" " + al + " Não passou de ano, faltarão " +al.verificaReprova() + "pontos para passar.");
        }

        sc.close();

    }
}
