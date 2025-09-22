import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int n;
        int i;
        int j;
        System.out.println("The size of the array ");
        n = in.nextInt();
        int a[][] = new int[n][n];
        System.out.println("enter the elements of array");

        for (i = 0; i < n; i++) {

            for (j = 0; j < n; j++) {
                a[i][j] = in.nextInt();

            }
        }

        for (i = 0; i < n; i++) {
            // System.out.println();
            for (j = 0; j < n; j++) {
                // System.out.print(  a[i][j]);
                //  System.out.print(" ");
                if (a[i][j] % 2 == 0) {
                    System.out.println("even numbers are" + a[i][j]);
                }
            }
            for (i = 0; i < n; i++) {
                System.out.println();
                for (j = 0; j < n; j++) {
                    System.out.print(a[i][j]);
                    System.out.print(" ");
                }
            }
        }
    }
}