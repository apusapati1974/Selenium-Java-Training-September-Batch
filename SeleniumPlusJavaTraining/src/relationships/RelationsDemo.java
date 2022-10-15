package relationships;
/*
 * RelationsDemo class is making object of Maruti class and initialized it. 
 * Though Maruti class does not have setColor(), setMaxSpeed() and carInfo() methods still we can use it due to 
 * IS-A relationship of Maruti class with Car class.
 */
public class RelationsDemo {
	public static void main(String[] args) {
		Maruti myMaruti = new Maruti();
		myMaruti.setColour(" Red ");
		myMaruti.setMaxSpeed(180);
		myMaruti.carInfo();
		myMaruti.MarutiStartDemo();
	}
}
