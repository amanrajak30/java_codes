import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s ;
        System.out.println("enter the string");
         s= in.next();
         char a[]=s.toCharArray();
        String s1 ; String res=""; String s2=" ";
        char ch= 'h';
         int l = s.length();
        for(int i = 0; i <=(l-1); i++) {
            if(a[i] == " "){

                s1=s1+ch;
            }
             else
                 s2=s2+s.charAt(i);

        }
        res=s1.concat(s2);
        System.out.println(res);
    }
}













        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

