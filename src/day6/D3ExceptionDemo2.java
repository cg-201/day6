package day6;

import java.util.Scanner;

public class D3ExceptionDemo2 {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			String name = "Capgemini";

			
			System.out.println("Enter Character Index");
			int index = scanner.nextInt();
			System.out.println(name.charAt(index));

			System.out.println("Congratulation, you got output!!");
			
			// worrry point!!!
			scanner.close();
		} catch(Exception esoham) {
			System.out.println("Invalid Index!!, Try Again!");
			System.out.println(esoham.getMessage());
			
			esoham.printStackTrace();
		}
	}
}
