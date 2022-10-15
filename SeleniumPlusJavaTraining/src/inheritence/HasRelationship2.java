package inheritence;

public class HasRelationship2 {
	public void relationship2() {
		System.out.println("This is Has Relationship2");
	}
	public static void main(String[] args) {
		HasRelationship1 hr1 = new HasRelationship1();
		hr1.relationship1();
		
		HasRelationship2 hr2 = new HasRelationship2();
		hr2.relationship2();
	}
}
