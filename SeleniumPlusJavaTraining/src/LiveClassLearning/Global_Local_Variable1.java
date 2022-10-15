package LiveClassLearning;

public class Global_Local_Variable1 {
	
	int glv = 123;	// Global Variable
	public void var_method(int glv) {	// Local Variable
		this.glv = glv;   // Trying to assign the value from global to local variable.
		/* this.glv  -- this will point to the global variable */
	}
	public static void main(String[] args) {
		Global_Local_Variable1 obj = new Global_Local_Variable1();
		obj.var_method(456);
		System.out.println("Value is : "+obj.glv);
	}
}
