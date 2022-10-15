package LiveClassLearning;

public class Debugging_BreakPoint {
	public void method2() {
		System.out.println("First line of m2");
		System.out.println("second line of m2");
	}
	public void method1() {
		System.out.println("First line of m1");
		System.out.println("Second line of m1");
	}
	public static void main(String[] args) {
		System.out.println("First line of main method.");
		Debugging_BreakPoint db = new Debugging_BreakPoint();
		db.method1();
		System.out.println("Second line of main method.");
		db.method2();
		System.out.println("Final line of code.");
	}
}
