public class voweltonextvowel {
    public static void main(String args[]) {
        String s = "hello", s1 = "";
        char c;
        char a[]={'a','e','i','o','u'};
        int l = s.length();
        char ch[]=s.toCharArray();
        for (int q=0;q<ch.length-1;q+=2){
            char temp=ch[q];
            ch[q]=ch[q+1];
            ch[q+1]=temp;
        }
        System.out.println(ch);
        for (int i = 0; i < l; i++) {
            c = s.charAt(i);
            if (c == a[0]) {
                s1=s1+a[1];
            }
            else if (c==a[1]) {
                s1=s1+a[2];
            } else if (c==a[2]) {
                s1=s1+a[3];
            } else if (c==a[3]) {
                s1 = s1 + a[4];
            } else if (c==a[4]) {
                s1=s1+a[0];
            }
            else
                s1=s1+c;
        }
        System.out.println(s1);
    }
}