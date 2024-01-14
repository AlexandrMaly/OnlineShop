package controllers;

import modeles.Delivery;
import modeles.Pickup;
import utils.Rounder;
import views.DeliveryOrderView;
import views.SelfPickupOrderView;

public class DeliveryOrderController {
    public void handleDate() {
        DeliveryOrderView deliveryOrderView = new DeliveryOrderView();
        String[] data = deliveryOrderView.getData();
        Delivery delivery = new Delivery();
        String cost = Rounder.roundValue(
                delivery.calculateTotalCost(Integer.parseInt(data[1]),
                        Double.parseDouble(data[2])));
        String output = "\nOrder: " + data[0] + ", will be delivered to the address " + data[3] +
                ", it will be necessary to pay " +
                cost + " UAH \nWe hurry to you!";

        DeliveryOrderView.getOutput(output);
    }
}
