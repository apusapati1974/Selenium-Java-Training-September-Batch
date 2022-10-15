package LiveClassLearning;

public class Global_Local_Variable {
	
	int glv = 910;    // Global variable
	public void variable_method(int var1) {   // var1 is local variable
		glv = var1;  // Assigning the value from local to global variable
	}
	public static void main(String[] args) {
		Global_Local_Variable objvar = new Global_Local_Variable();
		objvar.variable_method(123);
		System.out.println("Value of glv is : " + objvar.glv);
	}

}
