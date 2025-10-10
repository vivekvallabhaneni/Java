package patterns;

public class Square {
    public static void main(String[] args) {
        Square a1=new Square();
        a1.square(4);
    }
    public void square(int a){
        for(int i=1; i<=a;i++){
            for(int j=1;j<=a;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
