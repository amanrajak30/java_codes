import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System .in);
        String s; char c='';int sp=0,d=0,sa=0,ca=0;
        System.out.println(" enter a strong password");
        s=in.next();
        int l=s.length();
        if (l<10) {
            for (int i=0;i<l-1;i++) {
                c = s.charAt(i);
                if (c == '') {
                    sp++;
                } else if (c.isUpperCase(s)) {
                    ca++;
                } else if (c.isLowerCase(s)) {
                    sa++;
                } else if (c.isDigit(s)) {
                    d++;
                }
            }
                if (sp==2&&ca==2&&sa==2&&d==4)
                    System.out.println("the passwo" +
                            "rd is Strong");
                else
                    System.out.println("the password is weak");
            }

        }
    }

