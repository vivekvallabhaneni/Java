package oop;

public class Car {
    public static void main(String[] args) {
        Car a1=new Car();
        a1.car("BMW",2024,30000);
    }
    public void car(String brand, int model,int price){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }
}
