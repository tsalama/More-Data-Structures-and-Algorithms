/**
 * Creates a Queue and its methods using an ArrayList for each of the four lanes.
 */

import java.util.*;

public class CarQueues {

	private ArrayList<Car> cars;

	public CarQueues() {
		cars = new ArrayList<Car>();
	}

	/**
	 * Adds car to the lane (queue).
	 * @param inCar Car object added to the lane.
	 */
	public void enqueue(Car inCar) {
		cars.add(inCar);
	}

	/**
	 * Removes car from the lane.
	 * @return Car object that is removed.
	 */
	public Car dequeue() {
		Car out = cars.get(0);
		cars.remove(0);
		return out;
	}

	/**
	 * @return Car object in the front of the lane.
	 */
	public Car first() {
		return cars.get(0);
	}

	/**
	 * @return Number of cars in the lane.
	 */
	public int size() {
		return cars.size();
	}
}
