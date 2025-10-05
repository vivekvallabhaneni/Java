package org;

public class Largest {
    public static void main(String[] args){
        int a=20;
        int b=30;
        int c=25;
        int largest;

        if (a >= b && a >= c){
            largest=a;
        }
        else if(b>=a && b>=c){
            largest=b;
        }
        else{
            largest=c;
        }
        System.out.print("The largest Number is:" + largest);
    }
}
