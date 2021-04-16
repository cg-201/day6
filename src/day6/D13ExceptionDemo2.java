package day6;

public class D13ExceptionDemo2 {
	public static void main(String[] args)    {
		
		try {
			architMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static void architMethod()  throws Exception{
		try {
			rahulMehtod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			// we are not killing the exception
			throw e;
		}
	}
	
	
	
	// checked 
	public static void rahulMehtod() throws Exception {
		try {
			// i do some task here;
			// but i can also throws an exception
			String name = "cadadf";
			name.charAt(100);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			
			// we are not killin the exceptoin
			throw e;
		}

	}
}
