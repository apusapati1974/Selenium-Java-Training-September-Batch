package Assignments;
/*
 * Three Parameterized Constructor
 * Default Constructor
 * Two Parameterized Constructor
 * One Parameterized Constructor
 */
public class Day3_Assignment1 {
	public Day3_Assignment1() {
		this(1,2,3);
		System.out.println(" This is Default Constructor ");
	}
	public Day3_Assignment1(int x) {
		this(1,2);
		System.out.println(" This is One Constructor");
	}
	public Day3_Assignment1(int x,int y) {
		this();
		System.out.println(" This is Two Constructor");
	}
	public Day3_Assignment1(int x,int y,int z) {
		System.out.println(" This is Three Constructor");
	}
	public static void main(String[] args) {
		Day3_Assignment1 constructor = new Day3_Assignment1(1);
		
	}
}
