public class binary_to_decimal {
    public static void main(String args[]){
        long n=1000; long r=0;int i=0;
        int  num=0;
        while (n!=0){
            r=n%10;
            n=n/10;
           num+=r*Math.pow(2,i);
            ++i;
        }
        System.out.println(num);

    }
}
