package Oct_16_Assignments;

import java.util.Scanner;

/*
 * Assignment -1 : (((((x1+x2)+x3)-x4)*x5)/x6)
 * take the inputs from the user using scanner class
 * Create 4 method (Sum,Sub,Mul,Div)
 */

public class Assignment_1 {
	
	public int sum(int a,int b) {
		int c = a+b;
		return c;
	}
	public int sub(int a,int b) {
		int c = a-b;
		return c;
	}
	public int prod(int a,int b) {
		int c = a*b;
		return c;
	}
	public int div(int a,int b) {
		int c = a/b;
		return c;
	}
	public static void main(String[] args) {
		System.out.println("This is Assignment - 1");
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
		Assignment_1 a1 = new Assignment_1();
		int sumresult = a1.sum(x1, x2);
		int sumresult1 = a1.sum(sumresult,x3);
		int subresult = a1.sub(sumresult1,x4);
		int mulresult = a1.prod(subresult,x5);
		int divresult = a1.div(mulresult, x6);
		System.out.println("The Result of this expression (((((x1+x2)+x3)-x4)*x5)/x6) - "+divresult);
		
		
	}
	
}
