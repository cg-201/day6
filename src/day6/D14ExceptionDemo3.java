package day6;

public class D14ExceptionDemo3 {
	public static void main(String[] args)    {
		
		try {
			architMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static void architMethod() throws Exception {
		rahulMehtod();
	}
	
	
	// too lazy to handle exception :: Checked Exception
	public static void exceptionDemo() throws Exception {
		// i do some task here;
		// but i can also throws an exception
		String name = "cadadf";
		name.charAt(100);
	}
	
	
	public static void rahulMehtod() throws Exception {
		// i do some task here;
		// but i can also throws an exception
		String name = "cadadf";
		name.charAt(100);
	}
}
