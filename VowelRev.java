import java.util.Scanner;

public class VowelRev {
    public static boolean isVowel(char s){
            char[] v={'a','e','i','o','u'};
            for(int i=0;i<5;i++)
                if(s==v[i])
                    return true;
        return false;
    }
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        s=s.toLowerCase();
        char[] c2=s.toCharArray();
        String fs="";
        int l=s.length();
        
    
        for(int i=0;i<l;i++){
            if(!isVowel(c2[i])){
                fs=fs+c2[i];
            }
        }
        char[] c1=fs.toCharArray();
        int l2=c1.length;
        for(int i=l2-1;i>=0;i--){
            System.out.print(c1[i]);
        }
            
        
       
    
    }
}
