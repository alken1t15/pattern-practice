package PatternTask.iterator;

public class Main {
    public static void main(String[] args) {
        Task c = new Task();
        Iterator it = c.getIterator();
        while (it.hasNext()) {
            System.out.println((String) it.next());
        }
    }
}