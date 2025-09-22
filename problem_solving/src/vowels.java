public class vowels {
    public  static void main (String args[] ){
        String s="aman";
        char c; String vo="" ,co="";
        int l=s.length();
        for(int i=0;i<l;i++){
            c=s.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vo=vo+c;
            }
            else
                co=co+c;
        }
        System.out.println("the number of vowles are "+vo);
        System.out.println("the number of consonent are "+co);
    }
}
