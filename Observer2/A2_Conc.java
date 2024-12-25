package Observer2;

public class A2_Conc extends A0_Abstract {
    
    private int z;
    
    public void newChangesArrive(int z) {
        this.z = z;
        notifyObservers();
    }

    public int getZ() {
        return this.z;
    }
}
