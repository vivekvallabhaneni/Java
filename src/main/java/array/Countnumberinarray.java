package array;

public class Countnumberinarray {
    public static void main(String[] args) {
        int[] a= {10,20,30,10,30,20,40,50,60};
        int[] vistied= new int[a.length];
        int count;
        for(int i =0;i<a.length;i++) {
            if (vistied[i] == 1)
                continue;
            count = 1;
            for(int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    count++;
                    vistied[j]=1;
                }
        }
            System.out.println(a[i]+"->"+count+"times");


        }
    }
}
