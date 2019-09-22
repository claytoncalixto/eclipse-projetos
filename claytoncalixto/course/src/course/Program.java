package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		
		String product2 = "Office desk";
		
		int age = 30;
		
		int code = 5290;
		
		char gender = 'F';
		
		double price1 = 2100.0;
				
		double price2 = 650.50;
		
		double measure = 53.234567;
		
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Hello World!!!");
		
		System.out.println("---------------------------------");
		System.out.println("Products: ");
		System.out.printf("%s, wich price is $ %.2f%n", product1, price1);
		System.out.printf("%s, wich price is $ %.2f%n%n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender:%s%n%n",age, code, gender);
		System.out.printf("Measue with eigth decimal places: %.8f%n",measure);
		System.out.printf("Rouded: (three decimal places): %.3f%n",measure);		
		System.out.printf("US decimal point:%.3f%n",measure);
		
		System.out.println("---------------------------------");
		
		System.out.println("Enter your full name:");
		String nome = sc.nextLine();
		
		System.out.println("How many bedroons are there in your house: ");
		int quartos = sc.nextInt();
		
		System.out.println("Enter product price:");
		double preco = sc.nextDouble();
		
		System.out.println("Enter your last name, age and heigth(same line):");
		String lastName = sc.next();
		int idade = sc.nextInt();
		double altura = sc.nextDouble();
		
		System.out.println(nome);
		System.out.println(quartos);
		System.out.println(preco);
		System.out.println(lastName);
		System.out.println(idade);
		System.out.println(altura);
			
		
		sc.close();


	}

}
