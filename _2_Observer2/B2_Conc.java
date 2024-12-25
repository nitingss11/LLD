package _2_Observer2;

public class B2_Conc implements B_Observer {
    
    public void update(A_Subject subject) {
        A2_Conc sub = (A2_Conc) subject;
        System.out.println("I only take fixed type. My z is " + sub.getZ());
    }

}
