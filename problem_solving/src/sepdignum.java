public class sepdignum {
    public static void main(String args[]){
        char a[]={'1','2','3','4','5','6','7','8','9','0'};
        String s="aman"; char c;
        String s1="";String s2="";
        int l=s.length();
        for (int i=0;i<l;i++){
             c=s.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                s1=s1+c;
            }
           else
               s2=s2+c;
            }
        }
    }

