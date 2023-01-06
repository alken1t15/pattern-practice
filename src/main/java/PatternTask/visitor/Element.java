package PatternTask.visitor;

public interface Element {
    void accept(Visitor visitor);
}