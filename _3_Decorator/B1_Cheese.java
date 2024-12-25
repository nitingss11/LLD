package _3_Decorator;

//You become this pizza and build on top of it
public class B1_Cheese extends B_ToppingsDecorator {
    
    public B1_Cheese(A_Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return this.pizza.getDescription() + " + Cheese";
    }

    public int getCost() {
        return this.pizza.getCost() + 3;
    }

}
