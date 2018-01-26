import java.util.Scanner;
public class Diff1 {
 
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
        String s1=obj.next();
        String s2=obj.next();
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        int count=0;
        
        for(int i=0;i<s1.length();i++){
            if(c1[i]!=c2[i]){
                count++;
            }
        }
        if(count!=1){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
        
    }
        
}
