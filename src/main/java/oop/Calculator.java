package oop;

public class Calculator {
    public static void main(String[] args) {
    Calculator z1=new Calculator();
    z1.add(10,20);
    z1.sub(102,20);
    z1.mul(190,700);
    z1.div(4,2);
    }
    public void add(int a, int b){
        int c=a+b;
        System.out.println(c);
    }
    public void sub(int a, int b){
        int c=a-b;
        System.out.println(c);
    }
    public void mul(int a,int b){
        int c=a*b;
        System.out.println(c);
    }
    public void div(int a,int b){
        int c = a/b;
        System.out.println(c);
    }
}
