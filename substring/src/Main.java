//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s="aman"; String s1="am"; int c=0;
        int l; String s2="";
        l=s.length();
        /*for(int i=0; i<=l;i++){
            /*s2=s.substring(i,i+1);*/
            for(int j=0;j<=l;j++){
                s2=s.substring(j,j+1);
                if (s1.equalsIgnoreCase(s2)){
                    c++;
                }
            }
            System.out.println("the string "+s1+"is present"+c+"times");
            c=0;
        }

    }
}