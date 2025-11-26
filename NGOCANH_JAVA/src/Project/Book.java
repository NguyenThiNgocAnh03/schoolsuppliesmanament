package Project;

public class Book extends Product{
    private String coverType;

    public Book(String type, String productID, String productName, int quantity, double price, String coverType) {
        super(type, productID, productName, quantity, price);
        this.coverType = coverType;
    }

    public String getCoverType() {
        return coverType;
    }
    public String toString() { 
        return super.toString() + ", loai bia: " + coverType; 
    }
}


