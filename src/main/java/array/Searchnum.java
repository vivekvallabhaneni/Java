package array;

public class Searchnum {
    public static void main(String[] args) {
        int[] a={10,20,30,40};
        int b=50;
        boolean found=false;
        for(int i =0;i<a.length;i++){
            if(a[i]==b){
            found=true;
            break;
            }
        }
        if (found){
            System.out.println("Exists");
        }
        else {
            System.out.println("Not Exists");
        }
    }
}
