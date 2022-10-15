package inheritence;

public class Swift extends Maruthi{
	public void colour() {
		System.out.println("Colour - Balck");
	}
	public static void main(String[] args) {
		Swift obj = new Swift();
		obj.baseModel();
		obj.colour();
		obj.price();
	}
}
