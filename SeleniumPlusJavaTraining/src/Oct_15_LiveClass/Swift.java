package Oct_15_LiveClass;

public class Swift extends Maruti{
	public Swift() {
		super();
		System.out.println("This is Child Default Constructor");
	}
	public Swift(int a) {
		super(1);
		System.out.println("This is Child One Parameterized Constructor");
	}
	public Swift(int a,int b) {
		super(1,2);
		System.out.println("This is Child Two Parameterized Constructor");
	}
	public static void main(String[] args) {
		Swift obj = new Swift();
		
	}
}
