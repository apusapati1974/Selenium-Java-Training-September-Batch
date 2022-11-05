package Oct_30_Assignments;

public class Pattern_1 {
	
	public static void rightTraingle(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = 5;
		rightTraingle(n);
	}
}
