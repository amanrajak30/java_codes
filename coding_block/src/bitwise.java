import java.util.Scanner;

public class bitwise {
    public static void main (String args []){
        Scanner in =new Scanner(System.in);
        int n;
        System.out.println("enter the number ");
        n =in . nextInt();
        int k;
        System.out.println(" enter the k th element");
        k =in .nextInt();
        int mask=(1<<k);
        if ((mask&n)!=0){
            System.out.println("the k th value is set");
        }
        else
            System.out.println("the k th bit is not set");

        n|=mask;
        System.out.println(n);
        int mask1=~(1<<k);
        n&=mask1;
        System.out.println(mask);
        System.out.println(mask1);
        System.out.println(n);
        //flipping the first k bit to true /on /1
        int mask2=(1<<k)-1;
        System.out.println(mask2);
        //flipping the first k bit to false /off /2
        int mask3=~((1<<k)-1);

       while (n!=0){



        }



    }
}
