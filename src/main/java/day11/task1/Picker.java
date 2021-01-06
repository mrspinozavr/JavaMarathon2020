package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
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
        return "Пикер заработал = " + salary + (isPayed ? ", бонус выплачен " : ", бонус не выплачен");
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.addPickedOrder();
    }

    @Override
    public void bonus() {
        if (!isPayed) {
            if (warehouse.getCountPickedOrders() >= 10000) {
                salary += 70000;
                isPayed = true;
            } else {
                System.out.println("Бонус пока не доступен");
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }
}
