package Oct_30_Assignments;

public class Pattern_2 {
	
	public static void leftTraingle(int n) {  // Logic using if-else
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				if(i>=j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = 5;
		leftTraingle(n);
	}
}
