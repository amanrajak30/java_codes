import java.util.Scanner;

public class unique {
    static int c=0;
    public static int fibonacci_by_recurssion(int n ) {
        if (n == 1) {
            c++;
            return 0;
        }
        if (n == 2) {
            c++;
            return 1;
        }
       c++;
        int ans = (fibonacci_by_recurssion(n - 1) + fibonacci_by_recurssion(n - 2));

        return ans;
    }


    public static void main(String[] args) {

        int n = 5;



        System.out.println();
        System.out.println("Fibonacci series using recurssion" + n + " is: ");
        System.out.println(fibonacci_by_recurssion(n));
        for(int i=0;i<n;i++){
            System.out.println(fibonacci_by_recurssion(i));

        }
        System.out.println(c);


    }
}