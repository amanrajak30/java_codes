import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the g
class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int c;
        System.out.println("enter the range ");
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            c=0;
            for (int j = 2; j <= i/2; j++) {

                if (i % j == 0) {
                    c++;
                    break;
                }
            }
                if (c == 0 && n != 1)
                    System.out.println(i);

            }

        }
    }
