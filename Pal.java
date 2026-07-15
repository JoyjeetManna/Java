
import java.util.*;
class Pal
{
  public static void main(String args[])
  {

	Dcc D = new Dcc();
	D.palindrome();

  }	  
	
	
}	

class Dcc
{
   void palindrome()
   {
     Scanner sc = new Scanner(System.in);
	 int n,rev=0,rem;
     System.out.print("Enter the number: ");
	 n=sc.nextInt();
	 int temp=n;
     while(n>0)
	 {
		rem=n%10;
		rev = (rev*10)+rem;
		n=n/10;	
	 	 
	 }	 
     if(temp==rev)
		 System.out.print("true"); 
    else
		System.out.print("false");
   }	   
	
	
}	