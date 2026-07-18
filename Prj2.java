//Function OverLoading
 class Prj2
{
  public static void main(String args[])
   {
     Prjol P=new Prjol();
     P.sum(32,56);
     P.sum(12.4,6.3);
     P.sum('C','U');
   }

}

class Prjol
{
   void sum(int a,int b)
   {
   System.out.print("\nSum:"+(a+b));
   }

   void sum(double a,double b)
   {
   System.out.print("\nSum:"+(a+b));
   }

   void sum(char a,char b)
   {
   System.out.print("\nSum:"+a+b);
   }
}