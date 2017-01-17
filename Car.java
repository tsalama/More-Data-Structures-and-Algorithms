/**
 * Creates a car object.
 */

public class Car {

	private int creationTime;

	/**
	 * @param creationTime time when the car is created
	 */
	public Car(int creationTime) {
		this.creationTime = creationTime;
	}

	/**
	 * @return creationTime
	 */
	public int getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(int creationTime) {
		this.creationTime = creationTime;
	}
}
