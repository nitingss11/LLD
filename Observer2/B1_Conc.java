package Observer2;

import java.util.*;

public class B1_Conc implements B_Observer {
    
    public void update(A_Subject subject) {

        System.out.print("Inside the update of B1_Conc type ");
        if(subject instanceof A1_Conc) {
            A1_Conc sub = (A1_Conc) subject;
            System.out.println(sub.getX() + " " + sub.getY());
        } else if(subject instanceof A2_Conc) {
            A2_Conc sub = (A2_Conc) subject;
            System.out.println(sub.getZ());
        }

    }

}
