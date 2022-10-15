package inheritence;

public class SwiftVDI extends Swift{
	public void m1() {
		System.out.println("This is SwiftVDI Class");
	}
	public static void main(String[] args) {
		SwiftVDI ml = new SwiftVDI();
		ml.baseModel();
		ml.price();
		ml.colour();
		ml.m1();
	}
}
