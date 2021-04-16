package day6;

public class D2ExceptionDemo {
	public static void main(String[] args) {
		try {
			String name = "Capgemini";
			System.out.println(name.charAt(10));
		} catch(Exception e) {
			// fail safe logic
			System.out.println("Invalid Index");
			System.out.println(e.getMessage());
		}
		
	}
}
