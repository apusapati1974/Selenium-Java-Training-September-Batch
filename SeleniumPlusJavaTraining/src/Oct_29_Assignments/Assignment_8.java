package Oct_29_Assignments;

public class Assignment_8 {
	public void printFibonacciSeries() {
		int a=0,b=1;
		System.out.print(a+" , "+b);
		while(a+b<100) {
			b = a+b;
			a = b-a;
			System.out.print(" , "+b);
		}
	}
	public static void main(String[] args) {
		Assignment_8 obj = new Assignment_8();
		obj.printFibonacciSeries();
	}
}
