//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
int m=0;
        for (int i=1;i<=7;i++){
            for (int j=i;j<7;j++){
                System.out.print(" ");
            }
             for (int k=0;k<2*i-1;k++){

                 System.out.print("*");
             }
            System.out.println();
        }
        for (int l=1;l<7;l++){
            for ( m=0;m<l;m++){
                System.out.print(" ");
            }
            for (int n=l;n<7;n++){
                System.out.print("*");
            }
            for (int q=6;q>l;q--){
                System.out.print("*");
                }
            System.out.println();
        }

    }
}