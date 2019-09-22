package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of lines: ");
		int m = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter number of columns: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int [][] mat = new int[m][n];
		System.out.println();
		
		for(int i=0; i<mat.length ; i++) {
			for(int j=0; j<mat[i].length ; j++) {
				mat[i][j] = sc.nextInt();				
			}
		}
		
		System.out.print("Enter with number recurrence: ");
		int rec = sc.nextInt();
		System.out.println();
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if( mat[i][j] == rec) {
					System.out.println("Position " + i + "," + j + ":");
					if(j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if(i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if(i < mat.length) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}
			
		sc.close();

	}

}
