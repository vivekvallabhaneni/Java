package array;

public class Countevenandodd {
    public static void main(String[] args) {
        int[] a={2,3,4,6,89,87654,365,764};
        int count=0;
        for (int i=0;i<a.length;i++){
            if(a[i]%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
