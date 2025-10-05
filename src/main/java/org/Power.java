package org;

public class Power {
    public static void main(String[] args){
    Power a1=new Power();
    a1.num(2,4);
    }
    public void num(int a, int b){
        int c=1;
        for(int i=1;i<=b;i++){
            c*=a;
        }
        System.out.println(c);

    }
}
