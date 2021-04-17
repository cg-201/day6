package day6.qna.demo3;

public class Child extends Parent {

	
	public Child() {
		super();
		System.out.println("Iam child");
	}
	
	public Child(String name) {
		// super(); // parent constructor :: Parent Empty
		super(name); // parent construcotr :: Overloaded Construtor
		
		System.out.println("Iam child, with one param!!");
	}
	
	
	public static void main(String[] args) {
		Child child = new Child("Hello");
		System.out.println(child);
	}
}
