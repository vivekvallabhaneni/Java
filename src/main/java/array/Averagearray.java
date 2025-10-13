package array;

public class Averagearray {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50,2};
        int b=0;
        int avg = 0;
        for(int i=0;i<a.length;i++){
            b=b+a[i];

        }
        avg=b/a.length;
        System.out.println(avg);
    }
}
