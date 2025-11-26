package projecttest;
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Cua hang van phong pham ===");
            System.out.println("1. Xem tat ca san pham");
            System.out.println("2. Tim san pham");
            System.out.println("3. Mua san pham");
            System.out.println("4. Thoat");
            System.out.print("Chon: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) 
            shop.showAllItem();
            else if (choice == 2) {
                System.out.print("Nhập ID: ");
                shop.findItem(scanner.nextLine());
            } else if (choice == 3) {
                System.out.print("Nhập ID: ");
                String id = scanner.nextLine();
                System.out.print("Nhập số lượng: ");
                shop.buyItem(id, scanner.nextInt());
                scanner.nextLine();
            } else if (choice == 4) {
                System.out.println("Tạm biệt!");
                scanner.close();
                break;
            } else System.out.println("Chọn 1-4 thôi!");
        }
    }
}

