import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
String s;
        System.out.println("enter the digit ");
        s=in.next();
char c, c1='1',re='$';
      int l=s.length();
      String s1="";

      for (int i=0;i<l;i++){

          c=s.charAt(i);
          if (c==c1){
              s1=s1+re;

          }
          else
              s1=s1+c;

      }
        System.out.println(s1);


    }
}