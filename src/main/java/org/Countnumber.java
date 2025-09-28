package org;

public class Countnumber {
    public static void main(String[] args){
        Countnumber a1 = new Countnumber();
        a1.num(1234);
    }
    public void num( int n){
        int count = 0;
        while(n!=0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}
