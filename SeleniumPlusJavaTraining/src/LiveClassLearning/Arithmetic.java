package LiveClassLearning;

public class Arithmetic {
	public int sum(int a,int b) {
		
		int c = a+b;
		c=a+b;
		System.out.println("Sum is : "+c);
		return c;
	}
	public int sub(int x,int y) {
		int z = x - y;
		System.out.println("Sub result is : "+z);
		return z;
	}
	public void mul(int a1,int a2) {
		int a3 = a1 * a2;
		System.out.println("Final Result : "+a3);
	}
	
	public static void main(String[] args) {
		Arithmetic ar = new Arithmetic();
		int SumResult = ar.sum(10, 20);
		int SubResult = ar.sub(20, 5);
		ar.mul(SumResult, SubResult);
	}
}
