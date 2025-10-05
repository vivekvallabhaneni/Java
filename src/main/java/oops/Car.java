package oops;

public class Car extends Vechile{
    void horn(){
        System.out.println("car broke");
    }

    @Override
    void start() {
        System.out.println("Start");
    }
}
