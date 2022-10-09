package LiveClassLearning;
/* 
 * Training Class : Types of Methods.
 * Date : 27-08-2022 
*/

public class Student { 		//Pillar1  -  Indicated boundary/body of class
	
	int a ;  // Variable
	
	public void anudeep() {    // Method
		
		System.out.println("This is boundary of Method");  
	}

	public static void main(String[] args) {  // Piller2
		
		Student su = new Student();   // Piller3 
		su.anudeep();   // Piller 4
		su.a = 10;
		System.out.println(su.a);	
	
	}

}
