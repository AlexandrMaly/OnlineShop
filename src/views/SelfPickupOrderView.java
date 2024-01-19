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

    public void getOutput(String name, String time, String cost) {
        String output = "\nOrder: " + name + ", will be ready for pickup at " + time +
                ", it will be necessary to pay " +
                cost + " UAH \nWe are waiting for you!";
        System.out.println(output);
    }
}
