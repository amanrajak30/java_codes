import java.util.Scanner;

public class sqrt {
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        int n;
        System.out.println("enter the number");
        n=in.nextInt();
        for (int i=1;i<=n;i++) {
            if (i % 2 == 0)
                continue;
            System.out.println(i);

        }
    }
}
