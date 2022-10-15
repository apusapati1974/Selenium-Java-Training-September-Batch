package inheritence;

public class APIAutomation extends Automation{
	public void method3() {
		System.out.println("This is Child2 Class");
	}
	public static void main(String[] args) {
		APIAutomation aa = new APIAutomation();
		aa.method1();
		aa.method3();
		
	}
}
