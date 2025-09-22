import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class occurance {
    public static void main(String[] args) {
        String a = "program"; int co=0;char ch; char c;
        int length = a.length();
        for (int i = 0; i <= length-1; i++) {
            ch=a.charAt(i);

            for (int j=0;j<=length-1;j++) {
                c = a.charAt(j);
                if (ch == c) {
                    co++;
                }
            }
                System.out.println("the letter "+ch+ "is present "+co+"times");
                co=0;
        }

    }
}