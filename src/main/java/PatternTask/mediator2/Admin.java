package PatternTask.mediator2;

public class Admin extends User {

    public Admin(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Администратор " + getName() + " получает сообщение " + message);
    }
}