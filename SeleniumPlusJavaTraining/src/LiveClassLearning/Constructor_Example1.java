package LiveClassLearning;

public class Constructor_Example1 {
	public void Method1() {
		this.Method2();
		System.out.println(" This is Method1 ");
		this.Method3();
	}
	public void Method2() {
		System.out.println(" This is Method2 ");
	}
	public void Method3() {
		System.out.println(" This is Method3");
	}
	public static void main(String[] args) {
		Constructor_Example1 ce = new Constructor_Example1();
		ce.Method1();
	}
}
