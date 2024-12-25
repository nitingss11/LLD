package _3_Decorator;

public class B1_Corn extends B_ToppingsDecorator {
    
    public B1_Corn(A_Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return this.pizza.getDescription() + " + Corn";
    }

    public int getCost() {
        return this.pizza.getCost() + 4;
    }

}
