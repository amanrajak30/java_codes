public class dividestringequal {
    public static void main(String[] args) {
        String a = "aman", s1 = "", s2 = "";
        char c;
        int l = a.length();
        if (l%2!=0) {
            System.out.println("the string lengh  is not even ");
        } else {
            for (int i = 0; i < l / 2; i++) {
                s1 = s1 + a.charAt(i);
            }
            for (int i = l / 2; i < l; i++)
                s2 = s2 + a.charAt(i);
        }
    }
}

