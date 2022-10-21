package Oct_16_Assignments;

import java.util.Scanner;

/*
 *  Assignment -1 : (((((x1*x2)-x3)-x4)+x5)/x6)
 * take the inputs from the user using scanner class
 * Create 4 method (Sum,Sub,Mul,Div)
 */
public class Assignment_2 {
	public int add(int x,int y) {
		int z = x+y;
		return z;
	}
	public int sub(int x,int y) {
		int z = x-y;
		return z;
	}
	public int prod(int x,int y) {
		int z = x*y;
		return z;
	}
	public int div(int x,int y) {
		int z = x/y;
		return z;
	}
	public static void main(String[] args) {
		System.out.println("This is Assignment - 2");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x1 - ");
		int x1 = sc.nextInt();
		System.out.println("Enter the value of x2 - ");
		int x2 = sc.nextInt();
		System.out.println("Enter the value of x3 - ");
		int x3 = sc.nextInt();
		System.out.println("Enter the value of x4 - ");
		int x4 = sc.nextInt();
		System.out.println("Enter the value of x5 - ");
		int x5 = sc.nextInt();
		System.out.println("Enter the value of x6 - ");
		int x6 = sc.nextInt();
		Assignment_2 a2 = new Assignment_2();
		int mulresult = a2.prod(x1, x2);
		int subresult = a2.sub(mulresult,x3);
		int subresult1 = a2.sub(subresult,x4);
		int sumresult = a2.sub(subresult1,x5);
		int divresult = a2.div(sumresult,x6);
		System.out.println("The Result of this expression (((((x1*x2)-x3)-x4)+x5)/x6) - "+divresult);
	}
}
