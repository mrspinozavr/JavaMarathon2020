package day13;


import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        String nameUser1 = u1.getUsername();
        String nameUser2 = u2.getUsername();
        for (Message message : messages) {
            String nameReseiver = message.getReceiver().getUsername();
            String nameSender = message.getSender().getUsername();
            if ((nameUser1.equals(nameReseiver) && nameUser2.equals(nameSender)) || (nameUser2.equals(nameReseiver) && nameUser1.equals(nameSender))) {
                System.out.println(nameSender + ": " + message.getText());
            }
        }
    }
}
