package patterns;

public class Inverted {
    public static void main(String[] args) {
Inverted a2=new Inverted();
a2.invert(3);
    }
    public void invert(int a){
        int count=0;
        for(int i =1;i<=a;i++){
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
