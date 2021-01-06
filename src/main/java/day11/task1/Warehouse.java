package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void addPickedOrder() {
        countPickedOrders++;
    }

    public void addDeliveredOrder() {
        countDeliveredOrders++;
    }

    @Override
    public String toString() {
        return "Количество собранных заказов = " + countPickedOrders + ", количество доставленных заказов = " + countDeliveredOrders;
    }
}
