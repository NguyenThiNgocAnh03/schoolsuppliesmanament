package Project;

import java.util.Scanner;

public class Shop implements Item {
    public Product[] items;
    private int buyQuantity;

    public Shop() {
        items = new Product[15];
        items[0] = new Pen("But", "P01", "But chi", 50, 5000,"than chi " );
        items[1] = new Pen("But", "P02", "But bi", 55, 4500,"muc goc dau");
        items[2] = new Pen("But", "P03", "But do", 55, 4500,"muc goc dau");
        items[3] = new Pen("But", "P04", "But xanh", 55, 4500,"muc goc dau");
        items[4] = new Pen("But", "P05", "But may", 60, 30000,"muc nuoc");
        items[5] = new Book("Sach", "S01", "Sach toan ", 55, 55000,"bia cung");
        items[6] = new Book("Sach", "S02", "Sach van ", 70, 60000,"bia cung");
        items[7] = new Book("Sach", "S03", "Sach dia li", 70, 60000,"bia cung");
        items[8] = new Book("Sach", "S04", "Sach vat li", 70, 65000,"bia mem");
        items[9] = new Book("Sach", "S05", "Sach lich su", 85, 75000,"bia mem");
        items[10] = new Book("Sach", "S06", "Sach GDCD", 77, 60000,"bia cung");
        items[11] = new Product("Thuoc", "T01", "Thuoc deo", 70, 10000);
        items[12] = new Product("Thuoc", "T02", "Thuoc go", 55, 12000);
        items[13] = new Pen("But", "P06", "But mau", 70, 20000,"muc gel");
        items[14] = new Product("Vo", "V01", "Vo ke ngang", 70, 6000);
        
    }

    public int getBuyQuantity() {
        return buyQuantity;
    }

    public void showAllItem() {
        System.out.println("-----------------------------Danh sach san pham:---------------");
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                System.out.println(items[i]);
            }
        }
    }

    public void findItem() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Nhap ten san pham can tim (viet hoa chu dau tien): ");
            String name = input.nextLine();
            boolean found = false;
            for (int i = 0; i < items.length; i++) {
                if (items[i] != null && items[i].getProductName().contains(name)) {
                    System.out.println("Da tim thay san pham:");
                    System.out.println(items[i]);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Khong tim thay san pham! Vui long nhap lai.");
            } else {
                break;
            }
        }
    }

    public void buyItem() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Nhap ten san pham can mua (Viet hoa chu cai dau): ");
            String name = input.nextLine();
            Product findProduct = null;
            for (int i = 0; i < items.length; i++) {
                if (items[i] != null && items[i].getProductName().contains(name)) {
                    findProduct = items[i];
                    break;
                }
            }
            if (findProduct == null) {
                System.out.println("Khong tim thay san pham! Vui long nhap lai.");
                continue;
            }
            while (true) {
                System.out.print("Moi nhap so luong ban muon mua: ");
                if (input.hasNextInt()) {
                    buyQuantity = input.nextInt();
                    input.nextLine(); 
                    if (buyQuantity <= 0) {
                        System.out.println("So luong phai lon hon 0! Vui long nhap lai.");
                    } else if (findProduct.getQuantity() < buyQuantity) {
                        System.out.println("So luong trong kho khong du! Vui long nhap lai.");
                    } else {
                        findProduct.setQuantity(findProduct.getQuantity() - buyQuantity);
                        double bill = findProduct.getPrice() * buyQuantity;
                        System.out.println("Ban da mua hang thanh cong. Tong tien: " + bill + " VND. Con lai: " + findProduct.getQuantity()+" san pham trong kho.");
                        break;
                    }
                } else {
                    System.out.println("Vui long nhap so! Nhap lai.");
                    input.nextLine(); 
                }
            }
            break;
        }
    }
    }
