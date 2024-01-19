package modeles;

public class DeliveryModel implements Order {
    @Override
    public double calculateTotalCost(int quantity, double price) {
        return (quantity * price) + ((quantity * price) * 0.03);
    }

}
