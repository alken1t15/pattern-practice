package PatternTask.mediator;

public class Main {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat);
        User u1 = new SimpleUser(chat);
        User u2 = new SimpleUser(chat);

        chat.setAdmin(admin);
        chat.addUser(u1);
        chat.addUser(u2);

        u1.getMessage("Привет, я пользователь.");
        admin.sendMessage("АДМИН зашел в чат!!!");
    }
}
