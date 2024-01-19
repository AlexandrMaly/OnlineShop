package views;

import java.util.Scanner;

public class DeliveryOrderView {

    Scanner sc = new Scanner(System.in);

    public String[] getData() {

        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        System.out.print("Enter product quantity, pcs.: ");
        String quantity = sc.nextLine();
        System.out.print("Enter product price, USD: ");
        String price = sc.nextLine();
        System.out.println("Enter your delivery address: ");
        String address = sc.nextLine();
        sc.close();
        return new String[]{name, quantity, price, address};
    }

    public static void getOutput(String name, String address, String cost) {
        String output = "\nOrder: " + name + ", will be delivered to the address " + address +
                ", it will be necessary to pay " +
                cost + " UAH \nWe hurry to you!";
        System.out.println(output);
    }

}
