package Oct_30_Assignments;

import java.util.Scanner;

public class Pattern_3 {
	public static void javaPattern(int n) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n+" ");
				n++;
			
			}
			System.out.print("\n");
			
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the value of n - ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("------------------------");
		javaPattern(n);
	}
}
