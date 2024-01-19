package controllers;

import modeles.DeliveryModel;
import utils.Rounder;
import views.DeliveryOrderView;

public class DeliveryOrderController {
    public void handleDate() {
        DeliveryOrderView deliveryOrderView = new DeliveryOrderView();
        String[] data = deliveryOrderView.getData();
        DeliveryModel delivery = new DeliveryModel();
        String cost = Rounder.roundValue(
                delivery.calculateTotalCost(Integer.parseInt(data[1]),
                        Double.parseDouble(data[2])));
        DeliveryOrderView.getOutput(data[0], data[3], cost);
    }
}
