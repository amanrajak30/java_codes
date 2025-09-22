import java.util.Scanner;

public class short_leftwise {
    public static void main (String args []) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = in.nextInt();
        }
        b[4] = -1;
        int max = a[4];
        for (int i = 3; i >=0;i--) {
            b[i] = max;
            if (a[i] > max) {
                max = a[i];
            }
    }
        for (int k=0;k<5;k++){
            System.out.println(b[k]);
        }
    }
}
