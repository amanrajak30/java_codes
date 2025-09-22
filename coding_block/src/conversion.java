import java.util.Scanner;

public class conversion {
    public static void main (String args []){
        Scanner in =new Scanner(System.in);
        int iv,fv ,s;
        System.out.println("enter the initial value final value and steps ");
        iv=in.nextInt();
        fv=in.nextInt();
        s=in.nextInt();
        for(int i=iv;i<=fv;i=i+s){
            int c=(5*(i-32)/9);
            System.out.println(i+"       "+c);
        }
    }
}
