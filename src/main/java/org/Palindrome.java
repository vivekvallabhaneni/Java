package org;

public class Palindrome {
    public static void main(String[] args){
    Palindrome d1= new Palindrome();
    d1.pal(555);
    }
    public void pal(int a){
        int original = a;
        int rev = 0;
        while(a!=0){
            int b=a%10;
            rev=rev*10+b;
            a/=10;
        }
        if(original==rev){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
