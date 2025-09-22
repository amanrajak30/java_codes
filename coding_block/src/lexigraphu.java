public class lexigraphu {
    public static void main(String args[]) {
        String s = "nnwwsseessew";
        char c ;
        int v = 0, h = 0;
        int l = s.length();
        for (int i = 0; i < l; i++) {
            c = s.charAt(i);
            if (c == 'n')
                v++;
            if (c == 's')
                v--;
            if (c == 'e')
                h++;
            if (c == 'w')
                h--;
        }
        if (h > 0) {
            for (int j = 0; j < h; j++)
                System.out.print("e");
        }
        if (v > 0) {
            for (int j = 0; j < v; j++)
                System.out.print("n");
        }
        if (v < 0) {
            for (int j = 0; j < -v; j++)
                System.out.print("s");
        }
        if (h < 0) {
            for (int j = 0; j < -h; j++)
                System.out.print("w");
        }
    }
}


