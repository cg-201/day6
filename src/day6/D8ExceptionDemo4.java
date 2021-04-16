package day6;

import java.util.Scanner;

/**
 * 
 * we are writing same thing twice
 * scanner.close
 */
public class D8ExceptionDemo4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			// We can do it!!
			String name = "Capgemini";
			
			System.out.println("Enter Character Index");
			int index = scanner.nextInt();
			
			// can happen here
			System.out.println(name.charAt(index));
			
			
			try {
				// can also happen here
				int arr[] = {1};
				System.out.println(arr[5]);
				
				try {
					// can also happen here
					String name1 = null;
					name1.length();
				} catch(Exception e) {
					System.out.println("Null Exception");
				}
				
			} catch(Exception e) {
				System.out.println("Array Exceptoin!!");
			}

			System.out.println("Congratulation, you got output!!");
			
		} catch(Exception e) {
			
			System.out.println("Generic Handling of Exception!");
		}finally {
			// gurannteed block!!
			scanner.close();
		}
		
	}
}
