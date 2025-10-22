package oop;

public class Static {
    static String companyname ="Google";
    int empid;
    String empname;
    public Static(int id, String name){
        empid=id;
        empname=name;
    }
    public void display(){
        System.out.println("Emp id :"+empid);
        System.out.println("empname:"+empname);
        System.out.println("Company name:"+companyname);
    }

    public static void main(String[] args) {
        Static s1 = new Static(101,"sai");
        Static s2=new Static(102,"vivek");
        s1.display();
        s2.display();
    }
}
