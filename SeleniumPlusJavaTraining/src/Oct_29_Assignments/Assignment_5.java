package Oct_29_Assignments;

import java.util.Scanner;

public class Assignment_5 {
	
	// return true is number is Armstrong or return false
	private static boolean isArmstrong(int number) {
		int result = 0;
		int originalnum = number;
		while(number != 0 ) {
			int remainder = number % 10;
			result = result+remainder*remainder*remainder;
			number = number / 10;
		}
		// if number is Armstrong return true
		if(originalnum == result) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("Please enter the number - ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(isArmstrong(number)) {
			System.out.println("Number "+number+" is an Armstrong Number");
		}
		else {
			System.out.println("Number "+number+" is not an Armstrong Number");
		}
	}
}
