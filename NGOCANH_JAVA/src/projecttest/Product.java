package projecttest;


    public class Product implements Item {
    private String productID;
    private String productName;
    private String type;
    private double price;
    private int quantity;

    public Product() {}
    public Product(String type, String productID, String productName, int quantity, double price) {
        this.type = type;
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductID() { return productID; }
    public String getProductName() { return productName; }
    public String getType() { return type; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setProductID(String productID) { this.productID = productID; }
    public void setProductName(String productName) { this.productName = productName; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setType(String type) { this.type = type; }
    public void setPrice(double price) { this.price = price; }
    public String toString() { return "ID: " + productID + ", Ten: " + productName + ", Loai: " + type + ", Gia: " + price + ", So luong: " + quantity; }
}

