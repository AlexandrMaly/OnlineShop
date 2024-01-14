package controllers;

import modeles.Pickup;
import utils.Rounder;
import views.SelfPickupOrderView;

public class SelfPickupOrderController {

    public void handleDate() {
        SelfPickupOrderView selfPickupOrderView = new SelfPickupOrderView();
        String[] data = selfPickupOrderView.getData();
        Pickup pickup = new Pickup();
        String cost = Rounder.roundValue(
                pickup.calculateTotalCost(Integer.parseInt(data[1]),
                        Double.parseDouble(data[2])));
        String output = "\nOrder: " + data[0] + ", will be ready for pickup at " + data[3] +
                ", it will be necessary to pay " +
                cost + " UAH \nWe are waiting for you!";
        selfPickupOrderView.getOutput(output);
    }

}

