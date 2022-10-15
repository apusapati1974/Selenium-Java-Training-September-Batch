package inheritence;

public class SeleniumAutomation extends Automation{
	public void method2() {
		System.out.println("This is Child 1 Class");
	}
	public static void main(String[] args) {
		SeleniumAutomation sa = new SeleniumAutomation();
		sa.method1();
		sa.method2();
	}
}
