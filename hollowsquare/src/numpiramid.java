public class numpiramid {
    public static void main(String args[]) {
int c=1;
        for (int i = 1; i < 5; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print("  ");
            }
            for(int k = 0; k <(2*i-1); k++) {
                if (k % 2 == 0) {
                    System.out.print(" "+c+" ");
                    c++;
                }
            }
            System.out.println();

        }
    }
}
