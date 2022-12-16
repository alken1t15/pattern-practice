package PatternTask.Chain;

public class SmsLogger implements Logger{
    int priority;

    public SmsLogger(int priority) {
        this.priority = priority;
    }
    Logger next;

    public void setNext(Logger next) {
        this.next = next;
    }

    @Override
    public void writeMessage(String message, int level) {
        if(level<=priority){
            System.out.println("СМС: " + message);
        }
        if(next!=null){
            next.writeMessage(message,level);
        }
    }
}
