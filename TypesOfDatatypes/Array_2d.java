package TypesOfDatatypes;
import java.io.*;
import java.util.Scanner;
public class Array_2d {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter row size");
		int r = sc.nextInt();
		System.out.println("Enter column size");
		int c = sc.nextInt();
		double arr[][] = new double[r][c];
		System.out.println("Enter array elements");
		for(int i = 0;i<r;i++)
		{
			for(int j =0;j<c;j++)
			{
				arr[i][j] = sc.nextDouble();
				
			}
		}
		for(int i = 0;i<r;i++)
		{
			for(int j =0;j<c;j++)
			{
				
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
		
	}
}
