package relationships;
/*
 *  Maruti class uses Engine object’s start() method via composition. We can say that Maruti class HAS-A Engine.
 */
public class Engine {
	public void start() {
		System.out.println("Engine Started ");
	}
	public void stop() {
		System.out.println("Engine Stoped ");
	}
}
