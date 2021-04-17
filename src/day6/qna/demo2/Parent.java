package day6.qna.demo2;

public class Parent {
	
	// introvert
	private int id = 100;
	private void method1() {}
	
	// he reamins within the community :: package
	String title = "Capgemini";
	
	// outside the community/package :: IS A relationship
	protected String subtitle = "hello world";
	
	// extrovert
	public void twoWheeler() {
		System.out.println("Scotter Version");
		
		int i = 10;
		Integer j = i; // Auto Boxing
		Integer j2  = 10; // Auto Boxing
		Integer j1 = new Integer(i);  
		
		Integer k = new Integer(100);
		int l = k; // UnBoxing;
		
	}

}
