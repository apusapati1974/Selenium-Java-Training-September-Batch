package Oct_15_LiveClass;

public class Compiletime_Polymorphysm {
	public void arithmetic(int a,int b) {
		int c = a+b;
		System.out.println("Result is - "+c);
	}
	public int arithmetic(int x,int y,int z) {
		int result = x+y+z;
		System.out.println("Result is - "+result);
		return result;
	}
	public static void main(String[] args) {
		Compiletime_Polymorphysm  cp = new Compiletime_Polymorphysm();
		cp.arithmetic(10, 12);
		int r = cp.arithmetic(10, 11, 12);
	}
}
