public class replacevo {
        public  static void main (String args[] ) {
            String s = "aman", s1="";
            char re = '*';
            char c;
            int l = s.length();
            for (int i = 0; i < l; i++) {
                c = s.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    s1 = s1 + re;
                } else
                    s1 = s1 + c;
            }
            System.out.println("the new string is " + s1);
        }}

