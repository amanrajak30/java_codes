import java.util.*;
public class arraysum {
    public static int get_sum(int a[],int n){
        int sum=0;
        if(n<=0) {
            return 0;
        }
        return(a[n-1] + get_sum(a,n-1));



    }
    public static void main (String args[]){
        int a[]={20,50,30,20,40,20};
        int n=a.length;
       // int result = get_sum(a,n);
        System.out.println(get_sum(a,n));

    }
}
