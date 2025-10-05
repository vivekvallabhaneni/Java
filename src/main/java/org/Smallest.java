package org;

public class Smallest {
    public static void main(String[] args){
        int a =9 , b= 10 ,c=1;
        int d;
        if (a<=b && a<=c){
            d=a;
        }
        else if(b<=a && b<=c){
            d = b;
        }
        else{
            d=c;
        }
        System.out.print("The smallest name is :" + d);
    }
}
