//sum of digits

class Prj1
{
   public static void main(String args[])
   {
      Som S=new Som();
      S.sod(234);
    
   }

}

class Som
{
   void sod(int a) // methode
   {
      int s=0;
      while(a>0)
      {
	s=s+a%10;
	a=a/10;
      }
   System.out.print("\nSum of digit:"+s);

   }
}