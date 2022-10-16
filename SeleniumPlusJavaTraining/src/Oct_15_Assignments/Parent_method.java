package Oct_15_Assignments;

public class Parent_method {
	
	public void method() {
		System.out.println("This is Default method");
	}
	public void method1(int x) {
		this.method3(1, 2, 3);
		this.method();
		this.method2(1, 2);
		System.out.println("This is First Method");
		
	}
	public void method2(int x,int y) {
		System.out.println("This is Second Method");
	}
	public void method3(int x,int y,int z) {
		System.out.println("This is Third Method");
	}
	
	public static void main(String[] args) {
		Parent_method pm = new Parent_method();
		pm.method1(1);
	}
}
