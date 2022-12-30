package PatternTask.state2;

public class WeekEnd implements Activity {
    private int count = 0;

    @Override
    public void doSomething(Human context) {
        if (count < 3) {
            System.out.println("Отдыхаем (Zzz)");
            count++;
        } else {
            context.setState(new Work());
        }
    }
}