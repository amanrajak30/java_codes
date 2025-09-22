//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n =153 ; int t=n;
        int a;
        int b=0;

        while (t > 0) {
            a = t % 10;
            b = b + (a * a * a);
           t= t/10;
            a = 0;
        }if (n==b)
            System.out.println("the number is armstrong");
        else
            System.out.println("not an armstrong number");
    }
}

