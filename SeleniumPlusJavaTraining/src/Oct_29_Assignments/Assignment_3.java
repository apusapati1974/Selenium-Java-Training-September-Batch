package Oct_29_Assignments;

import java.util.Scanner;

/*
 * A Number is prime or not - A Number which is divisible by itself or 1
 */
public class Assignment_3 {
	public void checkPrime(int n) {
		int i,m=0,flag=0;
		m=n/2;
		if(n==0 || n == 1) {
			System.out.println(n+" It's a Prime Number");
		}
		else {
			for(i=2;i<=m;i++) {
				if(n%i == 0) {
					System.out.println(n+" It's not a Prime Number");
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				System.out.println(n+" It's a Prime Number");
			}
		}
	}
	public static void main(String[] args) {
		Assignment_3 obj  = new Assignment_3();
		obj.checkPrime(1);
		obj.checkPrime(25);
	}
}
