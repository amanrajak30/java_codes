import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class perfect {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n;int c=0;int b;
        System.out.println("enter the number");
             n=in.nextInt();
             b=n;
             for(int i=1;i<=n/2;i++) {

                 if (n % i == 0)
                     c += i;
             }
             if (c==b)
                 System.out.println("perfect number");

    }

}