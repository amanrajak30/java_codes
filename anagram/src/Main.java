import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
  class StringAnagram {

    public static  boolean areAnagramms (String str1,String str2) {
        str1 = str1.trim().toLowerCase();
        str2 = str2.trim().toLowerCase();

        if (str1.length() != str2.length()) {
            return false;

        }

        int[] charCount = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            charCount[str2.charAt(i)]--;
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
        public static void main (String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the first string");
            String str1 =sc.nextLine();
            System.out.println("enter the second string");
            String  str2 =sc.nextLine();

            if (areAnagramms(str1,str2)){
                System.out.println("the string are anagram");
            }
            else {
                System.out.println("the string are not anagram");
            }
            
        }



    }
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
