package day11.task1;

public class Courier implements Worker{
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Курьер заработал = " + salary + (isPayed ? ", бонус выплачен " : ", бонус не выплачен");
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.addDeliveredOrder();
    }

    @Override
    public void bonus() {
        if (!isPayed) {
            if (warehouse.getCountDeliveredOrders() >= 10000) {
                salary += 50000;
                isPayed = true;
            } else {
                System.out.println("Бонус пока не доступен");
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
