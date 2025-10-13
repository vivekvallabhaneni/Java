package array;

public class Sumofarray {
    public static void main(String[] args) {
        int[] a={10,20,30,40};
        int b=0;
        for(int i=0;i<a.length;i++){
            b=b+a[i];
        }
        System.out.println(b);
    }
}
