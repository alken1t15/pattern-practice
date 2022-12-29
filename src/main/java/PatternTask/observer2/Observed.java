package PatternTask.observer2;


public interface Observed {
    void addObserver(Observer O);

    void removeObserver(Observer o);

    void sendNotify();
}