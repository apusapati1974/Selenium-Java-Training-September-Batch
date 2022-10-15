package relationships;

public class Car {
	
	// Methods Implementation and class / instance members
	private String colour;
	private int maxSpeed;
	
	public void carInfo() {
		System.out.println("Car Colour - "+ colour + "Max Speed - "+ maxSpeed);
	}
	public void setColour(String colour) {
		this.colour = colour;
		
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
