package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);

        System.out.println("Работают сотрудники первого склада");
        businessProcess(picker1);
        businessProcess(courier1);
        System.out.println(picker1);
        System.out.println(courier1);

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);

        System.out.println("Работают сотрудники второго склада");
        picker2.doWork();
        courier2.doWork();

        System.out.println("Првоеряем значения первого склада и его сотрудников");
        System.out.println(warehouse1);
        System.out.println(picker1);
        System.out.println(courier1);

    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
