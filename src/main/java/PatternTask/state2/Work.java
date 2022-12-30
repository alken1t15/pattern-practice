package PatternTask.state2;

public class Work implements Activity {
    @Override
    public void doSomething(Human context) {
        System.out.println("Работаем!!!");
        context.setState(new WeekEnd());
    }
}