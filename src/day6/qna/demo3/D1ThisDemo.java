package day6.qna.demo3;

public class D1ThisDemo {
	
	// instance::this member
	private int id;
	private String name;
	private String email;
	
	// global member
	private static int i=100;
	
	
	// instance::this function
	public void method1() {
		System.out.println(this.id);
		System.out.println(this.email);
	}
	
	public void mehtod2() {
		this.id = 100;
		this.name = "ABcd";
		System.out.println(this.email);
	}
	

	public void method3() {
		System.out.println(this.id);
		this.method1();
		this.mehtod2();
	}
	
	
	// GLOBAL METHOD
	public static void main(String[] args) {
		// this.id = 100;
		
		D1ThisDemo ref = new D1ThisDemo();
		
		// ref is working as THIS here. 
		ref.id = 100;
		
		
	}
	
	
	
}
