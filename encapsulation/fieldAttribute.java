package encapsulation;

import java.util.Scanner;

public class fieldAttribute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        product productData1 = new product(2, "Laptop", "Asus Laptop", 5000, 3);
        product productData = new product();
        productData.setId(1);
        productData.setName("Laptop");
        productData.setDescription("Victus Laptop");
        productData.setPrice(5000);
        productData.setStockAmount(3);  
        ProductManager productManager = new ProductManager();
        //*productManager.Add2(1, "Laptop", "victus Laptop", 5000, 3);
        System.out.println("Product Code: " + productData.getCode());
        System.out.println("Product Code: " + productData1 .getCode());
        scan.close();
    }

}
