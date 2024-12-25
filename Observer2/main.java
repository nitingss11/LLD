package Observer2;

public class main {
    
    public static void main(String[] args) {
        
        //Two different type subjects
        A1_Conc a1_Conc1 = new A1_Conc();
        A2_Conc a2_Conc1 = new A2_Conc();

        //First observer
        B1_Conc b1_Conc = new B1_Conc();

        //First observer observes both A1 and A2 type subjects
        a1_Conc1.addObserver(b1_Conc);
        a2_Conc1.addObserver(b1_Conc);

        a1_Conc1.newChangesArrive(1, 2);
        a2_Conc1.newChangesArrive(3);

        System.out.println();

        //Second observer only observes only A2 type subject
        B2_Conc b2_Conc = new B2_Conc();

        A2_Conc a2_Conc2 = new A2_Conc();

        a2_Conc1.addObserver(b2_Conc);
        a2_Conc2.addObserver(b2_Conc);

        a2_Conc1.newChangesArrive(4);

        System.out.println();
        
        a2_Conc2.newChangesArrive(5);


    }
}
