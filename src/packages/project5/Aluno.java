package packages.project5;

public class Aluno {
    /*
    Fazer um programa para ler o nome do aluno e as 3 notas que obteve nos 3 trimestres. ao final deve mostrar se o aluno foi aprovado (Pass or Failed)
    */    
    public String name;
    public double note1;
    public double note2;
    public double note3;
    
    public double notas() {
        return (this.note1 + this.note2 + this.note3);
    }

    public double verificaReprova() {
        return 60 - notas(); 
    }

    public String toString() {
        return "O aluno: "+ name + " com nota final de: " + String.format("%.2f", notas());
    }

}
