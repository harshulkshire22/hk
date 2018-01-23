import java.util.Scanner;
public class Reverse {
    public static void main(String args[]) {
        String s;
        char[] c1;
        char[] c2;
        
        Scanner obj=new Scanner(System.in);
        s=obj.next();
        int l=s.length();
        c1=s.toCharArray();
        c2=s.toCharArray();
        for(int i=0;i<l;i++){
            c2[l-i-1]=c1[i];
            
        }
        for(int i=0;i<l;i++){
            System.out.print(c2[i]);
        }
        
        
    }
}