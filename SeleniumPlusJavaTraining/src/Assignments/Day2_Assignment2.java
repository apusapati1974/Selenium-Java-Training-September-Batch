package Assignments;
/*
 * Program Input : (((((10*2)-2)+2)-2)+2)
 * Assignment Done : 28-Aug-2022
 */
public class Day2_Assignment2 {
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
		Day2_Assignment2 aD = new Day2_Assignment2();
		int productResult = aD.prod(10, 2);
		int differenceResult = aD.diff(productResult, 2);
		int addResult = aD.add(differenceResult, 2);
		int diffResult = aD.diff(addResult, 2);
		aD.div(diffResult, 2);
	}
}
