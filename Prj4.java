import java.util.*;

class Prj4
{
  public static void main(String args[])
  {
   
    Xyz X = new Xyz();
    X.joy();


  }
}

class Xyz
{
  void joy()
 {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter Value : ");
   int a=sc.nextInt();
   int p =a;
   int s=0;
      while(a>0)
      {
	int d=a%10;
        s=s*10+d;
	a=a/10;
      }
    System.out.print("\nReverse: "+s);
    System.out.print("\nDifference: "+ Math.abs(s-p));
    


 }

}