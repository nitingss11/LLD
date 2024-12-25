package _3_Decorator;

public class A1_Pan implements A_Pizza {
    
    public String getDescription() {
        return "Base: Pan pizza";
    }

    public int getCost() {
        return 10;
    }
}
