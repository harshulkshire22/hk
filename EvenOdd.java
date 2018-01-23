import java.util.Scanner;

public class EvenOdd{

     
	public static void main(String []args){
        
		long n;
        
		Scanner obj=new Scanner(System.in);

        	n=obj.nextLong();
        
		if(n%2==0){
            
			System.out.println("Even");
        
		}
        
		else{
            
			System.out.println("Odd");
		
    }

     }
}