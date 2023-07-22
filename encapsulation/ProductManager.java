package encapsulation;

public class ProductManager {
    public void Add(product product) {
        //JDBC
        System.out.println("Product added: " + product.getName());
    }

    public void Add2(int id, String name, String description, double price, int stockAmount) {
        System.out.println("Product added: " + name);
        System.out.println("Product added: " + description);
        System.out.println("Product added: " + price);
        System.out.println("Product added: " + stockAmount);
        System.out.println("Product added: " + id);
    
    }
}
