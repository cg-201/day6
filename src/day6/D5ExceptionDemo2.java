package day6;

import java.util.Scanner;

/**
 * 
 * we are writing same thing twice
 * scanner.close
 */
public class D5ExceptionDemo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			// We can do it!!
			String name = "Capgemini";
			
			System.out.println("Enter Character Index");
			int index = scanner.nextInt();
			System.out.println(name.charAt(index));

			System.out.println("Congratulation, you got output!!");
			
		} catch(Exception esoham) {
			// In case, we cant do it!!
			
			System.out.println("Invalid Index!!, Try Again!");
			System.out.println(esoham.getMessage());
			
			esoham.printStackTrace();
		} finally {
			// Will alyways be done!
			// gurannteed block!!
			scanner.close();
		}
		
	}
}
