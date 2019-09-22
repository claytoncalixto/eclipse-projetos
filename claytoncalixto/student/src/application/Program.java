package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		System.out.println("Input: ");
		System.out.println();
	
		
		System.out.print("Enter name: ");		
		st.name = sc.nextLine();
		System.out.print("First note up to 30:");
		st.firstNote = sc.nextDouble();
		System.out.print("Second note up to 35: ");
		st.secondNote = sc.nextDouble();
		System.out.print("Third note up to 35: ");
		st.thirdNote = sc.nextDouble();
		
		System.out.println("Exit");
		System.out.println();
		st.studentApproved();
		
		
		
		sc.close();

	}

}
