package PatternTask.mediator;

public class Admin implements User{
    Chat chat;

    public Admin(Chat chat){
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message,this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Администратор получает сообщение " + message );
    }
}
