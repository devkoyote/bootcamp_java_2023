package packages.project4;

public class Employee {
    
    public String name;
    public double grossSalary;
    public double tax;

    // functions
    public double netSalary(){
        return this.grossSalary -= this.tax;
    }

    public void increaseSalary(double percentage){
        double rs = (this.grossSalary * percentage) / 100;
        this.grossSalary += rs;
    }

    // sobreposição de dados
    public String toString() {
        return name + ", " + " o novo salário é R$"+ String.format("%.2f", grossSalary) + " reais liquídos; "; 
    }

}
