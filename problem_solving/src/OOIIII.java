public class OOIIII {
    public static void main(String args[]){
        int a[]={1,0,1,0,1,1,0};
        int l=a.length; int c=0;
        for (int i=0;i<l;i++){
            if (a[i]==0)
                c++;
        }
        for (int i=0;i<c;i++){
            a[i]=0;
        }
        for (int i=c;i<l;i++){
            a[i]=1;
        }
        for (int i=0;i<l;i++){
            System.out.print(a[i]);
        }
    }
}
