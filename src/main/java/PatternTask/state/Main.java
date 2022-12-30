package PatternTask.state;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        Station dfm = new RadioDFM();
        radio.setStation(dfm);
        radio.play();

        for (int i = 0; i < 10; i++) {
            radio.play();
            radio.nextStation();
        }
    }
}