import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class numtoword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1=" ";
        int n;
        int l;
        String s[]= {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        System.out.println("enter the number");
        n = in.nextInt();
        while(n > 0) {
            l = n % 10;
            s1 = s[l]+" "+ s1;
            n = n / 10;
        }
        System.out.println(s1);
    }
}




