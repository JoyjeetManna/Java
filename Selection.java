import java.util.*;

class Selection
{
	public static void main(String args[])
	{
	  Abc Z= new Abc();
	  Z.sort();
	}
}	

class Abc
{ 
  void sort()
  {
	  
	 int a[]=new int[5];
     Scanner sc =new Scanner(System.in);
	 int i,j,temp,n;
	 System.out.print("Enter The Size Of The Array:  ");	
     	 n=sc.nextInt(); 
	System.out.print("Enter The Array:  ");	
     for(i=0;i<n;i++)
		 a[i]=sc.nextInt();
	for(i=0;i<n-1;i++)
	{
       for(j=i+1;j<n;j++)
	   {
		 if(a[i]>a[j])
		 {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		 }		
	   }   
	}
  System.out.print("The Sorted Array(Selection Sort): ");
  for(i=0;i<n;i++)
    System.out.print(a[i] + " ");	  
  }	  
}	