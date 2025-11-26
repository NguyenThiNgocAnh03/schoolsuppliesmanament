package projecttest;

public class Shop {
    private Product[] items;
    private int size;

    public Shop() {
        items = new Product[10];
        size = 0;
        items[size++] = new Product("Đo vẽ", "P001", "Thước", 200, 3000);
        items[size++] = new Book("Ghi chép", "P002", "Sổ tay", 50, 15000, "Cứng");
        items[size++] = new Pen("Viết", "P003", "Bút mực", 50, 7000, "Mực nước");
    }

    public void showAllItem() {
        if (size == 0) System.out.println("Không có sản phẩm!");
        else {
            System.out.println("Danh sách sản phẩm:");
            for (int i = 0; i < size; i++) System.out.println(items[i]);
        }
    }

    public void findItem(String id) {
        for (int i = 0; i < size; i++)
            if (items[i].getProductID().equals(id)) {
                System.out.println(items[i]);
                return;
            }
        System.out.println("Không tìm thấy ID: " + id);
    }

    public void buyItem(String id, int buyQuantity) {
        for (int i = 0; i < size; i++)
            if (items[i].getProductID().equals(id)) {
                if (buyQuantity <= 0) System.out.println("Số lượng phải lớn hơn 0!");
                else if (items[i].getQuantity() >= buyQuantity) {
                    items[i].setQuantity(items[i].getQuantity() - buyQuantity);
                    System.out.println("Mua thành công: " + items[i].getProductName() + ", Số lượng: " + buyQuantity + ", Tổng: " + (buyQuantity * items[i].getPrice()));
                } else System.out.println("Không đủ hàng!");
                return;
            }
        System.out.println("Không tìm thấy ID: " + id);
    }
}
