package PatternTask.observer;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileObserver implements Observer {
    File f;

    @Override
    public void handleEvent(int temp, int presser) {
        try {
            f = java.io.File.createTempFile("TempPressure", "_txt");
            PrintWriter pw = new PrintWriter(f);
            pw.print("Погода изменилась. Температура = " + temp + ", Давление = " + presser + ".");
            pw.println();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}