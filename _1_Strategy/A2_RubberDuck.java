package _1_Strategy;

public class A2_RubberDuck extends A_Duck {
    
    public A2_RubberDuck() {
        super(new B2_FlyNoWay());
    }

}
