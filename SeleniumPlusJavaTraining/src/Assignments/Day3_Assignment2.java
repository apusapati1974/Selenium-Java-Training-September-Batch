package Assignments;
/*
 * Output Sequence - 
 *  Three Parameterized Method
 *  Default Method
 *  One Parameterized Method
 *  Two Parameterized Method
 *  Four Parameterized Method
 */
public class Day3_Assignment2 {
	public void deafaultMethod() {
		this.Method3(1, 2, 3);
		System.out.println(" This is Default Method ");
		
	}
	public void Method1(int x) {
		this.deafaultMethod();
		System.out.println(" This is One Parameterised Method ");
		
	}
	public void Method2(int x,int y) {
		this.Method1(1);
		System.out.println(" This is Two Parameterised Method ");
		
	}
	public void Method3(int x,int y,int z) {
		
		System.out.println(" This is Three Parameterised Method ");
		
	}
	public void Method4(int x,int y,int z,int z1) {
		this.Method2(1, 2);
		System.out.println(" This is Fourth Parameterised Method ");
	}
	public static void main(String[] args) {
		Day3_Assignment2 method =  new Day3_Assignment2();
		method.Method4(1, 2, 3, 4);
	}
}
