import java.util.Scanner;
public class RightShift {
 
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
        
        int n=obj.nextInt();
        int[] a;
        a=new int[n];
        int k=obj.nextInt();
        int temp=0,i,j;
        for(i=0;i<n;i++){
            a[i]=obj.nextInt();
        }
        for(i=0;i<k;i++){
            temp=a[n-1];
            for(j=n-1;j>0;j--){
                a[j]=a[j-1];
            }
            a[0]=temp;
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]);
        }
        
    }
        
}

