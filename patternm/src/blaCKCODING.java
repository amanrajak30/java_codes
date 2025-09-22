import java.util.Scanner;
 class blaCKCODING{
    public static void main (String args[]){
        Scanner in =new Scanner(System.in);
        float r,p,t,si;
        System.out.println( "enter the rate principle amount and time ");
        r=in.nextFloat();
        p=in.nextFloat();
        t=in.nextFloat();
        si=(p*r*t)/100;
        System.out.println(si);
        }
    }

