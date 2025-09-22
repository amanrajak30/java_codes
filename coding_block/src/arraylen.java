import java.util.Scanner;

public class arraylen {
    public static void main (String args []){
        int l;int sum=0;
        Scanner in =new  Scanner(System.in);
        l=in.nextInt();
        int a[]=new int[l];
        for (int i=0;i<l;i++){
            a[i]=in.nextInt();
            sum = sum +a[i];
        }
//        for (int j=0;j<l;j++){
//             sum = sum +a[j];
//        }
         System.out.println(sum);
    }
}
