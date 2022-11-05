package Oct_30_Assignments;

import java.util.Scanner;

public class Pattern_4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows - ");
		int row = sc.nextInt();
		System.out.println("-----------------------------");
		for(int i=row-1;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		sc.close();
	}
	
}
