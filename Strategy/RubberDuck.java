package Strategy;

public class RubberDuck extends Duck {
    
    public RubberDuck() {
        super(new FlyNoWay());
    }

}
