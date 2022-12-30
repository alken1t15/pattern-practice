package PatternTask.state2;

import PatternTask.state2.Activity;

public class Human {
    private Activity state;

    public void setState(Activity s) {
        this.state = s;
    }

    public void doSomething() {
        state.doSomething(this);
    }
}