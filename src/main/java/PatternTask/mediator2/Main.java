package PatternTask.mediator2;

public class Main {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat, "Иван Иваныч");
        User u1 = new SimpleUser(chat, "Ваня");
        User u2 = new SimpleUser(chat, "Вова");
        User u3 = new SimpleUser(chat, "Саша");
        u2.setEnable(false);

        chat.setAdmin(admin);
        chat.addUser(u1);
        chat.addUser(u2);
        chat.addUser(u3);

        u1.sendMessage("Привет");
    }
}