package day13;

public class Task1 {
    public static void main(String[] args) {
        User sasha = new User("Саша");
        User nastya = new User("Настя");
        User den = new User("Денис");

        sasha.sendMessage(nastya, "Привет, пошли в кино?");
        sasha.sendMessage(nastya, "Я купил билеты на новый фильм!");
        nastya.sendMessage(sasha, "Привет!");
        nastya.sendMessage(sasha, "Извини, я не могу, у меня скоро экзамен");
        nastya.sendMessage(sasha, "Я зписалась на крутой Марафон по Java и не успеваю выполнить таски (");
        den.sendMessage(sasha, "Санек, привет, как дела?");
        den.sendMessage(sasha, "Го в доту?");
        den.sendMessage(sasha, "Надерем им задницы!");
        sasha.sendMessage(den, "Привет, Ден!");
        sasha.sendMessage(den, "Слушай, я тут задумался, ну их нафик всех - девушек, развлечения...");
        sasha.sendMessage(den, "Го лучше изучать Java! Напишем свой Фейсбук с Блекджеком и девушками)");
        den.sendMessage(sasha, "Слушай, отличная идея, давай попробуем!");

        MessageDatabase.showDialog(sasha, den);
    }
}
