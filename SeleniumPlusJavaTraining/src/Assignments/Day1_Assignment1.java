package Assignments;

public class Day1_Assignment1 {

	int age;       // Variable - 1
	int rollno;   // Variable - 2
	
	public void Display1() {     // Method - 1
		
		System.out.println("Wellcome to all of you");
	}
	
	public void Display2() {  // Method - 2 
		System.out.println("Automation is easy");
	}
	
	public static void main(String args[]) {   // Main Method	
		Day1_Assignment1 AD = new Day1_Assignment1();
		AD.Display1();
		AD.Display2();
		AD.age = 20;
		System.out.println("Age : "+AD.age);
		AD.rollno = 74;
		System.out.println("Roll No :"+AD.rollno);
		
	}
}
