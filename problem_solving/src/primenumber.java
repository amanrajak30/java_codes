public class primenumber {
    public static void main(String args[]) {
        int a[] = {1, 2, 5, 7, 11, 13, 17};
        int l = a.length; int z=0;
        int b[] = new int[l];
        int c = 0;int q=0;
        for (int i = 0; i < l; i++) {
            z = a[i];
            for (int j = 1; j <= z; j++) {
                if (a[i] % j == 0) {
                    c++;
                }
                if (c == 2) {
                    b[q++] = a[i];
                }
                c = 0;
            }
        }
            for (int k= 0; k < l; k++)
                System.out.print(b[k]);

    }
}
