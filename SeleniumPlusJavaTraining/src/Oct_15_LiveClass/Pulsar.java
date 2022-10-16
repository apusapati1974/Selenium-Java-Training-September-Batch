package Oct_15_LiveClass;

public class Pulsar extends Honda{
	public void method4() {
		super.method1();
		System.out.println("This is Child Default Constructor");
	}
	public void method5() {
		System.out.println("This is Child One Parameterized Constructor");
	}
	public void method6() {
		System.out.println("This is Child Two Parameterized Constructor");
	}
	public void method7() {
		System.out.println("This is Child Three Parameterized Constructor");
	}
	public static void main(String[] args) {
		Pulsar obj = new Pulsar();
		obj.method4();
	}
}
