package Oct_29_Assignments;

import java.util.Scanner;

/*
 * Printing 8 table using do-while loop
 */
public class Assignment_6 {
	
	public void printTable(int a) {
		int j = 1;
		do {
			System.out.println(a + " * "+j+" = "+a*j);
			j++;
		}while(j<=10);
	}
	
	public static void main(String[] args) {
		Assignment_6 obj = new Assignment_6();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value ");
		int a = sc.nextInt();
		obj.printTable(a);
	}
	
}
