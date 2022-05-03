import java.io.*;
import java.util.*;

public class matrmul{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows of matrix 1 : ");
		int row1 = sc.nextInt();
		System.out.print("\nEnter the number of columns of matrix 1 : ");
		int col1 = sc.nextInt();

		System.out.print("\n\nEnter the number of rows of matrix 2 : ");
		int row2 = sc.nextInt();
		System.out.print("\nEnter the number of columns of matrix 2 : ");
		int col2 = sc.nextInt();

		if(col1!=row2){
			System.out.println("\n\nMATRICES CANNOT BE MULTIPLIED !\n\n");
			System.exit(0);
		}

		int mat1[][] = new int[row1][col1];
		System.out.println("\nEnter the elements of Matrix 1 :\n");

		for(int i=0;i<row1;i++){
			for(int j=0;j<col1;j++){
				mat1[i][j] = sc.nextInt();
			}
		}

		int mat2[][] = new int[row2][col2];
		System.out.println("\nEnter the elements of Matrix 2 :\n");

		for(int i=0;i<row2;i++){
			for(int j=0;j<col2;j++){
				mat2[i][j] = sc.nextInt();
			}
		}

		
	
		int mul[][] = new int[row1][col2];
		int sum=0;
		
		for(int i=0;i<row1;i++){
			for(int j=0;j<col2;j++){
				sum =0;
				for(int k=0;k<row2;k++){
					sum += mat1[i][k]*mat2[k][j];
				}
				mul[i][j] = sum;
			}
		}

		System.out.println("MATRIX 1 : \n");
		for(int i=0;i<row1;i++){
			for(int j=0;j<col1;j++){
				System.out.print(mat1[i][j] + "\t");
			}
			System.out.println("");
		}		
		

		System.out.println("\n\nMATRIX 2 : \n");
		for(int i=0;i<row2;i++){
			for(int j=0;j<col2;j++){
				System.out.print(mat2[i][j] + "\t");
			}
			System.out.println("");
		}

		System.out.println("\n\n PRODUCT MATRIX : \n");
		for(int i=0;i<row1;i++){
			for(int j=0;j<col2;j++){
				System.out.print(mul[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}