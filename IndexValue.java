import java.util.Scanner;

public class IndexValue {
    public static void main(String args[]) {
        Scanner obj= new Scanner(System.in);
        int n=obj.nextInt();
        int a[]=new int[n];
        int count=0;
        for(int i=1;i<n;i++)
        {
            a[i]=obj.nextInt();
            if(a[i]==i)
            {
                System.out.print(a[i]);
                System.out.print(" ");
                count++;
            }
            
        }
        if(count==0)
            System.out.println(-1);
    }
}
