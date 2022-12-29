package PatternTask.observer;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observed {
    int temperature;
    int pressure;

    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void setMeasurements(int t, int p) {
        temperature = t;
        pressure = p;
        notifyObservers();
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.handleEvent(temperature, pressure);
        }
    }
}