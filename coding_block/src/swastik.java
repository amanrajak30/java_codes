public class swastik {
    public static void main(String args[]) {

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j==3||i==3)
                System.out.print("*"+" ");
                else if (j==0&&i<4)
                    System.out.print("*"+" ");
                else if (i==0&&j>3)
                    System.out.print("*"+" ");
                else if (i==6&&j<=3)
                    System.out.print("*"+" ");
                else if (j==6&&i>3)
                    System.out.print("*"+" ");
                else
                    System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
