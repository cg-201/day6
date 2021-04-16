package day6;

import java.util.Scanner;

/**
 * 
 * we are writing same thing twice
 * scanner.close
 */
public class D4ExceptionDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			String name = "Capgemini";
			
			System.out.println("Enter Character Index");
			int index = scanner.nextInt();
			System.out.println(name.charAt(index));

			System.out.println("Congratulation, you got output!!");
			
			// worrry point!!!
			scanner.close();
		} catch(Throwable esoham) {
			System.out.println("Invalid Index!!, Try Again!");
			System.out.println(esoham.getMessage());
			
			esoham.printStackTrace();
			
			scanner.close();
		}
	}
}
