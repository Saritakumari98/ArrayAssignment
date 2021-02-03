package ArrayAssignment;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows=sc.nextInt();
		
		System.out.println("Enter the number of columns");
		int columns=sc.nextInt();
		
		int arr1[][]=new int[rows][columns];
		int arr2[][]=new int[rows][columns];
		int arr[][]=new int[rows][columns];
		
		System.out.println("Enter the values in first matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("Enter the values in second matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("Values in first matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("Values in second matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				arr[i][j]=arr1[i][j]+arr2[i][j];
			}
			System.out.println();
		}
		
		System.out.println("Addition of matrix");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
