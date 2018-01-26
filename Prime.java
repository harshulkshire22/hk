import java.util.Scanner;
public class Prime {
 
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
        int c1=obj.nextInt();
        int c2=obj.nextInt();
        int count=0;
        
        for(int i=c1;i<=c2;i++){
            count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2||i==1){
                System.out.println(i);
        
            }
        
    }
        
}
}
