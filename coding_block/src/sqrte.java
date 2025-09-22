import java.util.Scanner;

class SquareRootWithoutFunction {
    public static double squareRoot(int number) {
        double start = 0;
        double end = number;
        double mid = 0;

        double precision = 0.0001;

        while ((end - start) > precision) {
            mid = (start + end) / 2;

            if (mid * mid > number) {
                end = mid;
            } else {
                start = mid;
            }
        }
        mid = (start + end) / 2;
        return ((int)(mid * 10000)) / 10000.0;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int number ;
        System.out.println("ehter the number");
        number=in.nextInt();
        double result = squareRoot(number);
        System.out.println("Square root of " + number + " is: " + result);
    }
}
