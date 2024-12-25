package _1_Strategy;

public class main {
    
    public static void main(String[] args) {

        A_Duck goose = new A1_GooseDuck();
        goose.performFly();
    
        A_Duck rubberDuck = new A2_RubberDuck();
        rubberDuck.performFly();
        
        rubberDuck.setFlyBehaviour(new B3_FlyRocketPowered());
        rubberDuck.performFly();

    }

}
