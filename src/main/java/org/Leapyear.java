package org;

public class Leapyear {
    public static void main(String[] args){
    Leapyear a1=new Leapyear();
    a1.year(2004);
    }
    public void year(int a){
        boolean b=false;
        if(a%4==0) {
            b = true;
        } else if (a%100==0) {
            b=false;
        }
        else if(a%400==0){
            b=true;
        }
        if(b){
            System.out.println(a+" is a Leap year");
        }
        else{
            System.out.println(a+" is not a leap year");
        }
    }
}
