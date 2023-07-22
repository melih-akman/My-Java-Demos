package encapsulation;

public class product {
    public product(int id, String name, String description, double price, int stockAmount) {
            System.out.println("Constructor worked");
            _id = id;
            _name = name;
            _description = description;
            _price = price;
            _stockAmount = stockAmount;
    }
    public product() {
        System.out.println("Constructor worked");
    }
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _code;

    // Getter
    public int getId() {
        return _id;
    }
    // Setter
    public void setId(int id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }
    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }
    public void setDescription(String description) {
        _description = description;
    }

    public double getPrice() {
        return _price;
    }
    public void setPrice(double price) {
        _price = price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }
    public void setStockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }

    public String getCode() {
        return _name.substring(0,1)+ _description.substring(0,1) + _id;
    }

}
