public class shorting {
    public static void main (String args[]){
        int a[]={1,3,5,26,7,3,9,6};int l=a.length;
        int b[]=new int[l];
        for (int i=0;i<l-1;i++){
            if (a[i]>a[i+1])
                System.out.println("sorted");

            else{
                System.out.println("not sorted");
            }
        }
        for (int j=0;j<l;j++){
            System.out.print(b[j]);
        }
    }
}
