package Observer2;

public class A1_Conc extends A0_Abstract {

    private int x;
    private int y;
    
    public void newChangesArrive(int x, int y) {
        this.x = x;
        this.y = y;
        notifyObservers();
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

}
