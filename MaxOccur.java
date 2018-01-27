import java.util.Scanner;

public class MaxOccur {
    
    public static char getMax(String s){
        int count[]=new int[256];
        int l=s.length();
        for(int i=0;i<l;i++){
            count[s.charAt(i)]++;
        }
        int max=-1;
        char r=' ';
        for(int i=0;i<l;i++){
        if(max<count[s.charAt(i)]){
            max=count[s.charAt(i)];
            r=s.charAt(i);
        }
        }
        return r;
    }
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        s=s.toLowerCase();
        System.out.println(getMax(s));
    }
}
