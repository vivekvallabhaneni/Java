package org;

public class Checking {
    public static void main(String[] args){
        Checking num = new Checking();
        num.positive(0);
    }
    public void positive(int a){
        if (a>0){
            System.out.println("Positive number");
        }
        else if (a<0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("Equal number");
        }
    }
}
