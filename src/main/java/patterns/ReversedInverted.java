package patterns;

public class ReversedInverted {
    public static void main(String[] args) {
        ReversedInverted call=new ReversedInverted();
        call.reversed(5);
    }
    public void reversed(int a){
        for(int i=a;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
