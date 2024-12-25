package Strategy;

public class A1_GooseDuck extends A_Duck {
    
    public A1_GooseDuck() {
        super(new B1_FlyWithWings());
    }

}
