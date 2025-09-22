import java.util.Scanner;

public class largest {
    public static void main (String args[]){

        Scanner in =new Scanner(System .in);
        int n;
        System.out.println("enter the value of n");
        n=in.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++) {
            System.out.println("enter the element of the array");
            a[i] = in.nextInt();
        }
        int l=a.length;
        int k = a[0];
        //int b[]=new int[l];
        for (int i = 0; i < l-1; i++) {
            if (a[i] > k) {
                k = a[i];

            }
        }
        System.out.println(a[n]);
        }
    }


