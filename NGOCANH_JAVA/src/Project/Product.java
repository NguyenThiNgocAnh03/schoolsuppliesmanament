package Project;

public class Product {
    private String productID;
    private String productName;
    private double price;
    private int quantity;
    private String type;
    public Product(){
    }
    public Product(String type,String productID,String productName,int quantity,double price){
        this.type=type;
        this.productID=productID;
        this.productName=productName;
        this.quantity=quantity;
        this.price=price;
    }
    public String getProductID(){
        return productID;
    }
    public String getProductName(){
        return productName;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getType(){
        return type;
    }
    public void setProductID(String productID){
        this.productID=productID;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public String toString(){
        return "Loai: "+this.type+", ID san pham: "+this.productID+", ten san pham: "+this.productName+", so luong hien co: "+this.quantity+", gia: "+this.price;
    }
}
