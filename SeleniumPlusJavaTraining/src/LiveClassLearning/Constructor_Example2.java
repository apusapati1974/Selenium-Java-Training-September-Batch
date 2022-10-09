package LiveClassLearning;

public class Constructor_Example2 {
	public void Method1() {
		this.Method3();  // First control will go to Thrid Method
		System.out.println("This is First Method");
	}
	public void Method2() {
		System.out.println("This is Second Method");
	}
	public void Method3() {
		this.Method2(); // Then control will go to Second Method	
		System.out.println("This is Thrid Method");
	}
	public static void main(String[] args) {
		Constructor_Example2 ce = new Constructor_Example2();
		ce.Method1();
	}
}
