package _3_Decorator;

public class A2_ThinCrust implements A_Pizza {
    
    public String getDescription() {
        return "Base: Thin Crust pizza";
    }

    public int getCost() {
        return 20;
    }
}
