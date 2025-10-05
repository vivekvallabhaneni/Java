package org;

public class Factorial {
    public static void main(String[] args){
        Factorial c=new Factorial();
        c.fact(8);
    }
    public void fact(int a){
        int b=1;
        for(int i=1;i<=a;i++){
            b=b*i;
        }
        System.out.println(b);
    }
}
