package oop;

public class Student {
  String name;
  int roll;
  double marks;
  public Student(String n,int r,double m){
      name=n;
      roll=r;
      marks=m;
  }
  public void display(){
      System.out.println("Name:"+name);
      System.out.println("roll"+roll);
      System.out.println("marks"+marks);
  }

    public static void main(String[] args) {
        Student s1=new Student("Vivek",102,320);
        Student s2= new Student("sai",103,203);
        Student s3=new Student("kumar",104,302);
        s1.display();
        s2.display();
        s3.display();
    }
}
