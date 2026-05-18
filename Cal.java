import java.util.*;

class Cal
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter 1st Number");
        a=sc.nextInt();
        System.err.println("Enter 2nd Number");
        b=sc.nextInt();
        System.err.println("Addition: "+ (a+b));
         System.err.println("Substitution: "+ (a-b));
          System.err.println("Multiplication: "+ (a*b));
           System.err.println("Division: "+ (a/b));
        
    }
}