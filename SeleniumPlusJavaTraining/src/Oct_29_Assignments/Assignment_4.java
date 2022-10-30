package Oct_29_Assignments;

import java.util.Scanner;

public class Assignment_4 {
	
	public void printPalindrome(int num) {
		int reverse = 0,element,remainder;
		element=num;
		while(num!=0) {
			remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num / 10;
		}
		
		if(element == reverse) {
			System.out.println("It's a Palindrome");
		}
		else {
			System.out.println("It's not a Plaindrome");
		}
	}
	
	public static void main(String[] args) {
		Assignment_4 obj = new Assignment_4();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number - ");
		int num = sc.nextInt();
		obj.printPalindrome(num);
	}
}
