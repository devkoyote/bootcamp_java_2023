package packages.project2;

public class Product {
    
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    // sobreposiçao mostra valor inves do ponteiro de referencia
   public String toString() {
       return name
        +", R$ "
        + String.format("%.2f", price)
        + ", "
        + quantity
        + " unidades, Total: R$ "
        + String.format("%.2f", totalValueInStock());
   }

}
