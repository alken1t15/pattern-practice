package PatternTask.mementro2;


public class Main {
    public static void main(String[] args) {
        Image image = new Image();
        image.set("Поезд", "250mb");
        System.out.println(image);
        File file = new File();
        file.setSaveImage(image.save());
        image.set("Танец", "550mb");
        System.out.println(image);
        image.load(file.getSaveImage());
        System.out.println(image);
    }
}