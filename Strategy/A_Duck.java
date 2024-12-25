package Strategy;

public abstract class A_Duck {
    
    private B_FlyBehaviour flyBehaviour;
    
    public A_Duck(B_FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    //Common method for all ducks
    public void swim() {
        System.out.println("all ducks swim");
    }

    //Method in contention
    //Instead of the fly implementation here, we call the fly of the strategy this duck takes
    public void performFly() {
        this.flyBehaviour.fly();
    }

    public void setFlyBehaviour(B_FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

}
