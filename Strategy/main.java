package Strategy;

public class main {
    
    public static void main(String[] args) {

        Duck goose = new GooseDuck();
        goose.performFly();
    
        Duck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        
        rubberDuck.setFlyBehaviour(new FlyRocketPowered());
        rubberDuck.performFly();

    }

}
