
import java.util.*;
class Bubble

{
   	public static void main (String args[])
	{
	   Xyz X = new Xyz();
	   X.sort();
}	}

class Xyz
{ 
  void sort()
  {
     int a[]=new int[5];	
	 int i,j,k;
	 Scanner sc =new Scanner(System.in);
	 System.out.print("Enter The Size Of The Array:  ");	
     	int n=sc.nextInt(); 
	System.out.print("Enter The Array:  ");		
	 for(k=0;k<n;k++)
	 a[k]=sc.nextInt();
     
	 for(i=0;i<n-1;i++)
	 {
		for(j=0;j<n-1-i;j++)
		{
           if(a[j]>a[j+1])
		   {
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		   }	
		 
		}	
	 }	
    System.out.print("The Sorted Array(Bubble Sort): ");		 
	for(i=0;i<n;i++)
	System.out.print(a[i]+ " ");	
  }	
}	
	