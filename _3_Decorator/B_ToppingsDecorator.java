package _3_Decorator;

//It takes a pizza and builds on top of it.
//Making it abstract since its the common code
public abstract class B_ToppingsDecorator implements A_Pizza {
    
    //Making it protected for child to be able to use
    //If we did not have this, we would not be able to use the input pizza we would build on top of
    protected A_Pizza pizza;

    //Since we coding to interface, we can build using any pizza
    public B_ToppingsDecorator(A_Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription();
    }

    public int getCost() {
        return pizza.getCost();
    }

}
