package patterns;

public class Pyramids {
    public static void main(String[] args) {
    Pyramids a1=new Pyramids();
    a1.ads(4);
    }
    public void ads(int a){
     for(int i=1;i<=a;i++){
         for(int j=1;j<=a-i;j++){
             for(int k=1;k<=i;k++){
                 System.out.print("* ");
             }
             System.out.println();
         }
     }
    }
}