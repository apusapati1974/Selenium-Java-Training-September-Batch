package Oct_15_Assignments;

public class Child extends Parent {
	
	public Child() {
		this(1,2);
		System.out.println("This is Child Default Constructor");
	}
	public Child(int x) {
		this(1,2,3);
		System.out.println("This is Child One Parameterized Constructor");
	}
	public Child(int x,int y) {
		super(1,2);
		System.out.println("This is Child Two Parameterized Constructor");
	}
	public Child(int x,int y,int z) {
		this();
		System.out.println("This is Child Three Parameterized Constructor");
	}
	public static void main(String[] args) {
		Child obj = new Child(2);
		
	}

}
