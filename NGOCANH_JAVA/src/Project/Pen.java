package Project;

public class Pen extends Product {
    private String kindInk;
    public Pen(){
        super();
    }

    public Pen(String type, String productID, String productName, int quantity, double price, String kindInk) {
        super(type, productID, productName, quantity, price);
        this.kindInk = kindInk;
    }

    public String getKindInk() { 
        return kindInk; }
    public String toString() { 
        return super.toString() + ", loai muc: " + kindInk; }
}



