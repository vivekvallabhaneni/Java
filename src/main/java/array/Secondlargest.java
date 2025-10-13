package array;

public class Secondlargest {
    public static void main(String[] args) {
        int[] a={10,20,40,30,90};
       int firstnum=Integer.MIN_VALUE;
        int secondnum=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]> firstnum){
                secondnum=firstnum;
                firstnum=a[i];
            }
            else if(a[i]>secondnum && a[i]!=firstnum){
                secondnum=a[i];
            }
        }
        System.out.println(secondnum);
    }
}
