//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
String s="ADYPU"; int l=s.length();

        for (int i=0;i<l;i++){
            for (int j=0;j<=i;j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
        for (int i=1;i<l;i++){
            for (int j=1;j<=i;j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }

    }
}