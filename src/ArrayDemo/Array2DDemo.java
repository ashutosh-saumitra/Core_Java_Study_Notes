package ArrayDemo;

import java.util.Scanner;

class Demo2D{
	Scanner sc = new Scanner(System.in);
	
	void Uniform(){
		int arr1[][] = new int [2][2];
		System.out.println("Enter 4 values:");
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Printing Uniform Array:");
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	void NonUniform(){
		int[][] arr2 = new int[3][];
		arr2[0] = new int[3];
		arr2[1] = new int[4];
		arr2[2] = new int[2];
		
		System.out.println("Enter 6 values:");
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr2[i].length;j++){
				arr2[i][j] = sc.nextInt();
			}
		}
		System.out.println("Printing Non-Uniform array Row size:"+arr2.length);
		System.out.println("Printing Non-Uniform Array:");
		for(int i=0;i<arr2.length;i++){
			System.out.println("Printing Non-Uniform array Column size:"+arr2[i].length);
			for(int j=0;j<arr2[i].length;j++){
				//
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
	void Driver(){
		//Uniform();
		NonUniform();
	}
}

public class Array2DDemo {
	public static void main(String[] args) {
		Demo2D demo2d = new Demo2D();
		demo2d.Driver();
		/*
		 * 2D Array Basics:
		 * 1- Uniform 2D Array.
		 * 		->Normal 2D Matrix
		 * 2- Non-Uniform 2D Array.
		 * 		-> For every row we can define separate column values
		 * 
		 * Operations in Array:
		 * 	1- Copying
		 * 	2- Equality
		 * 	3- Idempotent Matrix
		 * 	4- Inverse of a matrix
		 * 	5- Transpose of a matrix
		 *  6- Addition
		 *  7- Reverse Addition
		 *  8- Multiplication
		 *  9- Subtraction
		 *  
		 * 
		 * */
	}

}
