package patterns;

public class Reversednumber {
    public static void main(String[] args) {
        Reversednumber b=new Reversednumber();
        b.num1(4);

    }
    public void num1(int a){
        for(int i=a;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
