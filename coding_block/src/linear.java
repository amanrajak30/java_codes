import java.util.Scanner;

public class linear {
    public static void main (String args []){
        Scanner in =new Scanner(System .in);
        int n;
        System.out.println("enter the value of n");
        n=in.nextInt();
        int a[]=new int[n];
        int tar;
        boolean found=false;
        System.out.println("enter the target value");
        tar=in.nextInt();
        for (int i=0;i<n;i++) {
            System.out.println("enter the element of the array");
            a[i] = in.nextInt();
        }
        for (int i=0;i<n;i++){
            if (tar==a[i]){
                System.out.println(i);
                found=true;
            }

        }
        if (!found)
          System.out.println("-1");

    }
}
