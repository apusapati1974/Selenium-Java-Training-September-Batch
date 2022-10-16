package Oct_15_Assignments;

public class Parent {
	
	public Parent() {
		this(1,2,3);
		System.out.println("This is Parent Default Constructor");
	}
	public Parent(int x) {
		this();
		System.out.println("This is Parent One Parameterized Constructor");
	}
	public Parent(int x,int y) {
		this(1);
		System.out.println("This is Parent Two Parameterized Constructor");
	}
	public Parent(int x,int y,int z) {
		System.out.println("This is Parent Three Parameterized Constructor");
	}
	public static void main(String[] args) {
		Parent p = new Parent(1);
	}
	
}
