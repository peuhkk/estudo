package curso.entities;

public class Product {

    public String Name;
    public double Price;
    public int Quantity;

    public double TotalValueInStock(){
        return Price * Quantity;
    }

    public void AddProducts(int Quantity){
        this.Quantity += Quantity;
    }

    public void RemoveProducts(int Quantity){
        this.Quantity -= Quantity;
    }

    public String toString(){
     return "Product data: "
             +Name
             + ", $ "
             + String.format("%.2f",Price)
             +", "
             + Quantity
             + " units, Total: $"
             +String.format("%.2f",TotalValueInStock());
    }
}
