package PatternTask.observer2;

public class Main {
    public static void main(String[] args) {
        Netflix netflix = new Netflix();
        netflix.addObserver(new Maxim());
        netflix.updateInfoFilm("Мстители", 14, 2020);
    }
}