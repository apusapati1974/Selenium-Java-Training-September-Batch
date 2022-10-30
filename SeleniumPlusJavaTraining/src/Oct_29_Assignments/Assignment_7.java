package Oct_29_Assignments;

public class Assignment_7 {
   static int factorial(int n) {
	   if(n == 0) 
		   return 1;
	   else
		   return (n*factorial(n-1));
   }
   public static void main(String[] args) {
	int i,fact=1;
	int num = 4;
	fact = factorial(num);
	System.out.println("Factorial of "+num+" is "+fact);
}
}
