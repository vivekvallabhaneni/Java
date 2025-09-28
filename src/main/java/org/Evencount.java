package org;

public class Evencount {
    public static void main(String[] args){
    Evencount b1=new Evencount();
    b1.even(13);
    }
    public void even(int a){
       if(a%2==0){
           int count=0;
           while(a!=0){
               a/=10;
               count++;
           }
           System.out.println(count);
       }
       else{
           System.out.println(0);
       }
    }
}
