package _3_Decorator;

public class main {
    
    public static void main(String[] args) {
        
        A_Pizza pizza1 = new A2_ThinCrust();
        System.out.println(pizza1.getCost());

        pizza1 = new B1_Cheese(pizza1);
        System.out.println(pizza1.getCost());

        pizza1 = new B1_Cheese(new B1_Corn(pizza1));
        System.out.println(pizza1.getDescription());
        System.out.println(pizza1.getCost());
        
    }
}
