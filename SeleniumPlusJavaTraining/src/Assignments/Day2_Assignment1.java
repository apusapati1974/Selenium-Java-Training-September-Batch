package Assignments;
/*
 * Program Input : (((((10+2)-2)+2)*2)/2)
 * Assignment Done : 28-Aug-2022
 */
public class Day2_Assignment1 {
	public int add(int x,int y) {
		int z = x + y;
		System.out.println("Addition of X & Y is : "+z);
		return z;
	}
	public int diff(int x,int y) {
		int z = x - y;
		System.out.println("Difference of X & Y is :"+z);
		return z;
	}
	public int prod(int x,int y) {
		int z = x * y;
		System.out.println("Product of X & Y is : "+z);
		return z;
	}
	public void div(int x,int y) {
		int z = x / y;
		System.out.println("Division of X & Y is : "+z);
	}
	
	public static void main(String[] args) {
		Day2_Assignment1 aD = new Day2_Assignment1();
		int addResult = aD.add(10, 2);
		int diffResult = aD.diff(addResult, 2);
		int diffResult1 = aD.add(diffResult,2);
		int mulResult = aD.prod(diffResult1,2);
		aD.div(mulResult,2);
	}
}
