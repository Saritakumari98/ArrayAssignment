package ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the array size");
        int size=sc.nextInt();
        
        int ar[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Before sorting");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		System.out.println();
		Arrays.sort(ar);
		
		System.out.println("After sorting");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}

}
