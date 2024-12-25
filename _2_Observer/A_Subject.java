package _2_Observer;

public interface A_Subject {

    public void addObserver(B_Observer observer);
    public void removeObserver(B_Observer observer);
    public void notifyObservers();

}