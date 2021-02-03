package ArrayAssignment;

import java.util.Scanner;

public class SearchElement {

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
			
			int temp = 0,x = 0;
			
			System.out.println("Enter the number, you want to find:");
			int n=sc.nextInt();
			sc.close();
			
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]==n)
				{
					temp=i;
					x=ar[i];
				}
				
			}
			
			if(x==n)
			{
				System.out.println("Index of the element is "+temp);
				
			}
			else
			{
				System.out.println("-1");
				
			}

	}

}
