package day7;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    private Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
    }

    public static Player getNewPlayer(int stamina) {
        if (countPlayers < 6) {
            return new Player(stamina);
        } else {
            System.out.println("Достигнут предел игроков");
            return null;
        }
    }

    public int getStamina() {
            return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina > 0) {
            System.out.println("Игрок бежит");
            stamina--;
            if (stamina == 0) {
                System.out.println("Игрок выдохся, уходит на скамью запасных");
                countPlayers--;
            }
        }
    }

    public static void info() {
        if (countPlayers >= 0 && countPlayers <= 1) {
            System.out.printf("Команды неполные. На поле еще есть %d свободных мест\n", (6 - countPlayers));
        } else if (countPlayers >= 2 && countPlayers <= 4) {
            System.out.printf("Команды неполные. На поле еще есть %d свободных места\n", (6 - countPlayers));
        } else if (countPlayers == 5) {
            System.out.printf("Команды неполные. На поле еще есть %d свободное место\n", (6 - countPlayers));
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
