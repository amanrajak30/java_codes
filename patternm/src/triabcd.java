public class triabcd {
    public static void main (String args []){
        for (int i=0;i<4;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
                 for (int q=i;q<4;q++){
                     System.out.print((char)('D'-q));
                 }
            System.out.println();
        }
    }
}
