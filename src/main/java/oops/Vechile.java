package oops;

public abstract class Vechile {
    abstract void horn();
    abstract void start();
    void stop(){
        System.out.println("Vechile broke");
    }
}
