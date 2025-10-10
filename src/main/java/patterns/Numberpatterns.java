package patterns;

public class Numberpatterns {
    public static void main(String[] args) {
        Numberpatterns cl=new Numberpatterns();
        cl.num(4);

    }
    public void num(int a){
        for(int i =1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
