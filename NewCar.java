/**
 * Adds a car to the lane according to its chance of creation.
 */

public class NewCar {

	private double chance;

	public NewCar(double chance) {
		this.chance = chance;
	}

	/**
	 * Adds a car to a lane.
	 * @param lanes One of the four lanes
	 * @param time Creation time
	 */
	public void addNewCar(LinkedQueue<Car> lanes[], int time) {
		for (int i = 0; i < 4; i++) {
			if (Math.random() < chance) {
				lanes[i].enqueue(new Car(time));
			}
		}
	}
}
