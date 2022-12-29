package PatternTask.observer2;


import java.util.ArrayList;
import java.util.List;

public class Netflix implements Observed {
    private String nameFilm;
    private int sizeFilm;
    private int ageFilm;

    List<Observer> observers = new ArrayList<>();

    public void updateInfoFilm(String nameFilm, int sizeFilm, int ageFilm) {
        this.nameFilm = nameFilm;
        this.sizeFilm = sizeFilm;
        this.ageFilm = ageFilm;
        sendNotify();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void sendNotify() {
        for (Observer o : observers) {
            o.showInfo(nameFilm, sizeFilm, ageFilm);
        }
    }

}