package Oct_29_Assignments;

import java.util.Scanner;

public class Assignment_1 {
	
	public void thridVariable(int a,int b) {
		int c = a;
		a = b;
		b = c;
		System.out.println("\n");
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is "+b);
		System.out.println("---------------------------------");
	}
	
	public void withoutThirdVariable(int a,int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is "+b);
	}
	
	public static void main(String[] args) {
		Assignment_1 obj = new Assignment_1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b ");
		int b = sc.nextInt();
		obj.thridVariable(a, b);
		obj.withoutThirdVariable(a, b);
	}

}
