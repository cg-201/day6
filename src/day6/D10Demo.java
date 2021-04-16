package day6;

public class D10Demo {
	
	public static void main(String[] args) {
		
		Base b = new ChildA();
		
		
		demo1(10);
		demo2("abcd");
		
		ChildA childA = new ChildA();
		demo3(childA);
		
	
		ChildB childB = new ChildB();
		demo4(childB);
		
		// polymorhisime :: inhertiance
		demoCatch(childA);
		demoCatch(childB);
	}
	
	
	public static void demo1(int i) {}
	
	public static void demo2(String str) {}
	
	public static void demo3(ChildA ref) {}
	public static void demo4(ChildB ref) {}
	
	public static void demoCatch(Base b) {}
	
}




class Base {}
class ChildA extends Base {}
class ChildB extends Base {}