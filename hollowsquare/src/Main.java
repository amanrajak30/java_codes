import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                if (i==0||i==n||j==0||j==n) {
                    System.out.print(" * ");
                }
                else if (i==1&&j==1||i==1&&j==3) {
                    System.out.print(" * ");
                }
                else if (i==n-1&&j==1||i==3&&j==3) {
                    System.out.print(" * ");
                }

                    else
                    System.out.print("   ");
                }
            System.out.println();
            }
        }
    }
