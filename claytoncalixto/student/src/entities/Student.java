package entities;

public class Student {
	
	public String name;
	public double firstNote;
	public double secondNote;
	public double thirdNote;
	
	public double finalNote() {
		return firstNote + secondNote + thirdNote;
	}
	
	public void studentApproved() {
		
		if(finalNote()>= 60) {
			System.out.println("FINAL GRADE = " + String.format("%.2f", finalNote()));
			System.out.println("PASS");
		}else {
			System.out.println("FINAL GRADE = " + String.format("%.2f", finalNote()));
			System.out.println("FAILED");
			double result = 60.00 - finalNote();
			System.out.println("MISSING " +  String.format("%.2f",result ) + " " + "POINTS");
		}
	}

}
