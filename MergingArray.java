package ArrayAssignment;

import java.util.Scanner;

public class MergingArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of Arrays");
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        
        int ar1[]=new int[size1];
        int ar2[]=new int[size2];
        
        System.out.println("Enter the value of first array");
        for(int i=0;i<ar1.length;i++)
        {
        	ar1[i]=sc.nextInt();
        }
        
        
        System.out.println("Enter the value of second array");
        for(int i=0;i<ar2.length;i++)
        {
        	ar2[i]=sc.nextInt();
        }
        
        
        System.out.println("Values of both arrays");
        for(int i=0;i<ar1.length;i++)
        {
        	System.out.print(ar1[i]+" ");
        }
        System.out.println();
        
        
        for(int i=0;i<ar2.length;i++)
        {
        	System.out.print(ar2[i]+" ");
        }
         System.out.println();
        
        
        
        int ar[]=new int[size1+size2];
        for(int i=0;i<ar1.length;i++)
        {
        	ar[i]=ar1[i];
        }
        
        
        for(int i=0;i<ar2.length;i++)
        {
        	ar[ar1.length+i]=ar2[i];
        }
        
        
        for(int i=0;i<ar.length;i++)
        {
        	System.out.print(ar[i]+" ");
        }
        
        
	}

}
