//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={6,7,8,9,10};
        int al=a.length;
        int bl=b.length;
        int l=al+bl;
        int c[]=new int [l];int i=0,j=0,k=0;
          while (i<al) {
              c[k++] = a[i++];
          }
        while (j<bl){
            c[k++]=b[j++];
        }


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        for (int q=0;q<l;q++){
        System.out.print(c[q]);
}}}