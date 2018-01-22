import java.util.Scanner;

public class Numbers{
  public static void main(String args[]){
    Scanner obj=new Scanner(System.in);
    
    int n=obj.nextInt();
    if(n>=0)
      System.out.println("positive");
    else
      System.out.println("negative");
   }
}