package day6;

public class D12ExceptionDemo {
	public static void main(String[] args)   {
		try {
			exceptionDemo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	// too lazy to handle exception :: Checked Exception
	public static void exceptionDemo() throws Exception {
		// i do some task here;
		// but i can also throws an exception
		String name = "cadadf";
		name.charAt(100);
	}
}
