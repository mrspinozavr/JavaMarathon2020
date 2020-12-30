package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player.info();
        System.out.print("На поле выходит Роналдо!\n");
        Player ronaldo = Player.getNewPlayer(100);
        for (int i = 0; i < 10; i++) {
            Player.info();
            Player.getNewPlayer((random.nextInt(11) + 90));
        }
        System.out.printf("Сейчас на поле %d игроков\n", Player.getCountPlayers());
        while (true) {
            if (ronaldo.getStamina() == 0) {
                break;
            }
            ronaldo.run();
        }
        System.out.printf("Сейчас на поле %d игроков\n", Player.getCountPlayers());
    }
}
