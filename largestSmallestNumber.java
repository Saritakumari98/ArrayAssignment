package ArrayAssignment;

import java.util.Scanner;

public class largestSmallestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of Array");
		
		int size=sc.nextInt();
		
		int ar[]=new int[size];
		
		System.out.println("Enter the array values");
		
			for(int i=0;i<ar.length;i++)
			{
				ar[i]=sc.nextInt();
			}
		
		System.out.println("Arrays values are:");
		
			for(int i=0;i<ar.length;i++) 
			{
			  System.out.print(ar[i]+" ");
			}
		  System.out.println();
			
		  int first_largest=ar[0];
		  int second_largest=ar[1];
		  for(int i=1;i<ar.length;i++)
		  {
			  if(first_largest<ar[i])
			  {
				  second_largest=first_largest;
				  first_largest=ar[i];
			  }
			  else if(second_largest<ar[i])
				  second_largest=ar[i];
		  }
		  
		  System.out.println("First largest element "+first_largest);
		  System.out.println("Second largest element "+second_largest);
		  
		  
		  int first_smallest=ar[0];
		  int second_smallest=ar[1];
		  for(int i=1;i<ar.length;i++)
		  {
			  if(first_smallest>ar[i])
			  {
				  second_smallest=first_smallest;
				  first_smallest=ar[i];
			  }
			  else if(second_smallest>ar[i])
				  second_smallest=ar[i];
		  }
		  
		  System.out.println("First smallest element "+first_smallest);
		  System.out.println("Second smallest element "+second_smallest);

	}

}
