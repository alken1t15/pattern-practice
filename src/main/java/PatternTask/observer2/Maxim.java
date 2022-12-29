package PatternTask.observer2;

public class Maxim implements Observer {
    @Override
    public void showInfo(String nameFilm, int sizeFilm, int ageFilm) {
//        System.out.println("Вышел новый фильм под название " + nameFilm + " его размер " + sizeFilm + " год выпуска " + ageFilm);
        System.out.printf("Вышел новый фильм под название %s его размер %d год выпуска %d", nameFilm, sizeFilm, ageFilm);
    }
}