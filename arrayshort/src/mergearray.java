public class mergearray {
    public static void main (String arges[]){
        int a[]={1,2,3,4,5};int b[]={6,7,8,9,0};
        int d=a.length; int e=b.length; int n;
        n=d+e; int i=0,j=0,k=0;
        int m []=new int[n];
        while (i<d){
            m[k++]=a[i++];
        }
        while (j<e){
            m[k++]=b[j++];
        }
        for (k=0;k<n;k++){
            System.out.println(m[k]);
        }
    }
}
