package controllers;

import views.SelfPickupOrderView;

import java.util.Scanner;

public class OnlineShopController {

    Scanner sc = new Scanner(System.in);

    public void getOption() {
        System.out.println("""
                If you carry out self-delivery, you will receive a 3% discount on the order.
                If you order delivery, you need to pay an additional 3% of the order.
                Choose whether you want to:
                1 - pick up the order
                2 - order with delivery
                """);
        sc = new Scanner(System.in);
        OnlineShopController onlineShopController = new OnlineShopController();
        onlineShopController.getPayment(sc.nextInt());
    }

    private void getPayment(int option) {
        if (option == 1) {
            SelfPickupOrderController selfPickupOrderController = new SelfPickupOrderController();
            selfPickupOrderController.handleDate();
        } else if (option == 2) {
            DeliveryOrderController deliveryOrderController = new DeliveryOrderController();
            deliveryOrderController.handleDate();
        } else {
            System.out.println(option + " is wrong.");
        }
    }

}
