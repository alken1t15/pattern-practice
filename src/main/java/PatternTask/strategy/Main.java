package PatternTask.strategy;

public class Main {
    public static void main(String[] args) {
        StrategyClient c = new StrategyClient();
        int[] arr0 = {1,3,2,1};
        c.setStrategy(new SelectionSort());
        c.executeStrategy(arr0);

        int[] arr1 = {11,4,2,7,8,54};
        c.setStrategy(new BubbleSort());
        c.executeStrategy(arr1);
    }
}