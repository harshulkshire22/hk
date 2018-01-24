import java.util.Scanner;
public class Roman {
    public static int mapping(char c){
        switch(c){
            case 'I': {return 1;}
            
            case 'i': {return 1;}
            
            case 'V':{return 5;}
            
            case 'v':{return 5;}
            
            case 'X':{return 10;}
            
            case 'x':{return 10;}
        }
        return 0;
    }
    public static void main(String args[]) {
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        char[] s1=s.toCharArray();
        int value=0,prev_value=9999,r=0;
        for(int i=0;i<s.length();i++){
            value=mapping(s1[i]);
            if(value>prev_value){
                r+=value-(2*prev_value);
            }
            else{
                r+=value;
            }
        }
        System.out.println(s+"="+r);
    }
}
