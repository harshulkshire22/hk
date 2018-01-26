import java.util.Scanner;
public class SwapEvenOdd {
 
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
        SwapEvenOdd ob=new SwapEvenOdd();
        String s=obj.next();
        char[] c1=s.toCharArray();
        char temp='\0';
        for(int i=0;i<s.length();i+=2){
            temp=c1[i];
            c1[i]=c1[i+1];
            c1[i+1]=temp;    
        }
        for(int i=0;i<s.length();i++){
            System.out.print(c1[i]);
        }
    }
        
}