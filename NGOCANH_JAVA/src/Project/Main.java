package Project;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Cua hang van phong pham ===");
            System.out.println("1. Xem tat ca san pham");
            System.out.println("2. Tim san pham");
            System.out.println("3. Mua san pham");
            System.out.println("4. Thoat");
            System.out.print("Chon: ");

            int choice = input.nextInt();
            input .nextLine();
            if (choice ==1){
                shop.showAllItem();
            }
            else if(choice==2){
                shop.findItem();
            }
            else if(choice == 3){
                shop.buyItem();
            }
            else if(choice == 4){
                System.out.println("Cam on va hen gap lai!");
                break;

            }else{
                System.out.println("Vui long chi chon 1-4!");
            }
            }        
    }
}



