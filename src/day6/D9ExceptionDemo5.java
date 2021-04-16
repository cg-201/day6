package day6;

import java.util.Scanner;

/**
 * 
 * we are writing same thing twice
 * scanner.close
 */
public class D9ExceptionDemo5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			// We can do it!!
			String name = "Capgemini";
			
			System.out.println("Enter Character Index");
			int index = scanner.nextInt();
			
			// can happen here
			System.out.println(name.charAt(index));
			
			// can also happen here
			int arr[] = {1};
			System.out.println(arr[5]);
			
			// can also happen here
			String name1 = null;
			name1.length();
			

			System.out.println("Congratulation, you got output!!");
			
		} catch(NullPointerException ne) {
			
			System.out.println("Please put valid non-null value!!");
			System.out.println(ne.getMessage());
		} catch (StringIndexOutOfBoundsException ae) {
			
			System.out.println("Invalid Index!!");
			System.out.println(ae.getMessage());
		} catch(ArrayIndexOutOfBoundsException ae) {
			
			System.out.println("Invalid array");
		} catch(Exception e) {
			
			System.out.println("Generic Handling of Exception!");
		}finally {
			// Will alyways be done!
			// gurannteed block!!
			scanner.close();
		}
		
	}
}
