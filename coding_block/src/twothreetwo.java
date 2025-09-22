public class twothreetwo {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" "+" ");
            }
            int c= i;
            for (int k = 0; k < i; k++) {
                System.out.print(c+" ");
                c++;
            }
            int ca=2*i-2;
            for (int q=0;q<i-1;q++){
                System.out.print(ca+" ");
                 ca--;
            }
            System.out.println();
        }
    }
}
