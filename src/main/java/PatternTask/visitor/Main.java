package PatternTask.visitor;

public class Main {
    public static void main(String[] args) {
//        Element body = new BodyElement();
//        Element engine = new EngineElement();
//        Visitor hooligan = new HooliganVisitor();
//
//        body.accept(hooligan);
//        engine.accept(hooligan);
        Element car = new CarElement();
        car.accept(new HooliganVisitor());
        System.out.println();
        car.accept(new MechanicVisitor());
    }
}