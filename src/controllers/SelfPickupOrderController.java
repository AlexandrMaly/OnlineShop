package controllers;

import modeles.PickupModel;
import utils.Rounder;
import views.SelfPickupOrderView;

public class SelfPickupOrderController {

    public void handleDate() {
        SelfPickupOrderView selfPickupOrderView = new SelfPickupOrderView();
        String[] data = selfPickupOrderView.getData();
        PickupModel pickup = new PickupModel();
        String cost = Rounder.roundValue(
                pickup.calculateTotalCost(Integer.parseInt(data[1]),
                        Double.parseDouble(data[2])));
        selfPickupOrderView.getOutput(data[0], data[3], cost);
    }

}

