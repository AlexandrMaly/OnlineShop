package views;

import java.util.Scanner;

public class SelfPickupOrderView {
    Scanner sc = new Scanner(System.in);

    public String[] getData() {

        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        System.out.print("Enter product quantity, pcs.: ");
        String quantity = sc.nextLine();
        System.out.print("Enter product price, USD: ");
        String price = sc.nextLine();
        System.out.println("Enter the time when you pick up the product: ");
        String time = sc.nextLine();
        sc.close();
        return new String[]{name, quantity, price, time};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
