
//try catch 
import java.util.*;

class Prj3
{
  public static void main(String args[])
  {
     Div D = new Div();
     D.abc();
  }
}

class Div
{
   void abc()
   {

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Value 1 : ");
      int a=sc.nextInt();
      System.out.print("Enter Value 2 : ");
      int b=sc.nextInt();
      try
      {
      System.out.print("Division= "+(a/b));
      }
      catch(Exception e)
      {
        System.out.print("Zero diye bhag jaina \nEnglish Version " + e);
      }


   }

}