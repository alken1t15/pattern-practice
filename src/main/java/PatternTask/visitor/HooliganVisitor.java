package PatternTask.visitor;

public class HooliganVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Завел двигатель");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Постучал по корпусу");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Покурил внутри машины");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Пнул " + wheel.getName() + " колесо");
    }
}