import java.util.Scanner;

public class twin_tower {
    public static void main(String args[]){
        Scanner in =new Scanner(System .in);
        int n= in.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=in.nextInt();
        }int max=a[0];
        for (int j=1;j<n;j++){
            if (a[j]>max){
                int t=a[j];
                a[j]=max;
                max=t;
            }
        }

    }
}
