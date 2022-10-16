package Oct_15_Assignments;

public class Child_method extends Parent_method{
	public void method4() {
		super.method1(1);
		System.out.println("This is Child Default Method");
		this.method7(1, 2, 3);
		this.method5(1);
		this.method6(1, 2);
	}
	public void method5(int x) {
		System.out.println("This is Child First Method");
	}
	public void method6(int x,int y) {
		System.out.println("This is Child Second Method");
	}
	public void method7(int x,int y,int z) {
		System.out.println("This is Child Third Method");
	}
	public static void main(String[] args) {
		Child_method cm = new Child_method();
		cm.method4();
	}
}
