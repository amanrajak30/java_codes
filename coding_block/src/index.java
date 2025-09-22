import java.util.Scanner;

public class index {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("enter the value of n");
        n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the element of the array");
            a[i] = in.nextInt();
        }
        int l = a[0];int smid=0;

        for (int j = 0; j < n; j++) {
            if (a[j] < l) {
                l = a[j];

            }

        }
    }
}
