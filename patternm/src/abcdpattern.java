public class abcdpattern {
    public static void main(String args[]) {

        for (int q = 0; q < 4; q++) {
            for (int j = q; j < 4; j++) {
                System.out.print(" ");

            }
            for (int k=q;k>=0;k--)
            {
                System.out.print((char)('A'+k));
            }

            System.out.println();
        }

        }
    }


