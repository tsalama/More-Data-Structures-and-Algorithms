/**
 * Creates an intersection and produces results.
 */

public class Intersection {

	public static final int TOTAL_TIME = 1000; // Simulation time in seconds.
	private int time; // Current time.
	private int lightDuration; // Frequency of light change.

	private boolean xLight; // Light color in x direction.
	private boolean yLight; // Light color in y direction.

	private int numCars[];
	private int delay[];
	private LinkedQueue<Car> lanes[];

	private NewCar newCar;

	/**
	 * Constructor
	 * @param newCar Adds car to lane.
	 * @param lightDuration Frequency of light change.
	 */
	public Intersection(NewCar newCar, int lightDuration) {
		time = 0;
		this.lightDuration = lightDuration;
		this.newCar = newCar;

		/**
		 * True is green and false is red.
		 */
		xLight = true;
		yLight = false;

		/**
		 * Creates arrays to store info on the number of cars and delay time for each lane.
		 * Creates the lane queues.
		 */
		numCars = new int[4];
		delay = new int[4];
		lanes = new LinkedQueue[4];

		/**
		 * Initializes numCars and delay elements to 0.
		 * Populates each lane with a new queue.
		 */
		for (int i = 0; i < 4; i++) {
			numCars[i] = 0;
			delay[i] = 0;
			lanes[i] = new LinkedQueue<Car>();
		}
	}

	/**
	 * Sets frequency of light change.
	 * @param lightDuration
	 */
	public void setLightDuration(int lightDuration) {
		this.lightDuration = lightDuration;
	}

	/**
	 * Switches light colors.
	 */
	public void changeLights() {
		if (time % lightDuration == 0) {
			boolean temp = xLight;
			xLight = yLight;
			yLight = temp;
		}
	}

	/**
	 * Moves 2 cars in opposite directions across the intersection.
	 * @param lane1 first lane
	 * @param oppositeLane antiparallel lane
	 */
	public void move(int lane1, int oppositeLane) {
		/**
		 * Records delay time.
		 */
		delay[lane1] += time - (lanes[lane1].first().getCreationTime());
		delay[oppositeLane] += time - (lanes[oppositeLane].first().getCreationTime());

		/**
		 * Removes moving cars from queue.
		 */
		lanes[lane1].dequeue();
		lanes[oppositeLane].dequeue();

		/**
		 * Adds 1 car count to each lane.
		 */
		numCars[lane1]++;
		numCars[oppositeLane]++;
	}

	/**
	 * Calls move method if light is green.
	 */
	public void go() {
		try {
			if (xLight == true) {
				move(3, 1);
			}
			if (yLight == true) {
				move(2, 0);
			}
		}
		catch (NullPointerException exception) {
		}
	}

	/**
	 * Runs simulation.
	 */
	public void simulate() {
		for (; time < TOTAL_TIME; time++) {
			go();
			newCar.addNewCar(lanes, time);
			changeLights();
		}
	}

	/**
	 * Prints simulation results.
	 */
	public void results() {
		System.out.println("\t\tN\tE\tS\tW");

		System.out.println("Cars across:\t" + numCars[0] + "\t" + numCars[1]
				+ "\t" + numCars[2] + "\t" + numCars[3]);

		System.out.println("Delay (tot):\t" + delay[0] + "\t" + delay[1] + "\t"
				+ delay[2] + "\t" + delay[3]);

		System.out.print("Delay (avg):\t");
		for (int i = 0; i < 4; i++)
			System.out.print((delay[i] / numCars[i]) + "\t");

		System.out.println("\nStranded:\t" + lanes[0].size() + "\t"
				+ lanes[1].size() + "\t" + lanes[2].size() + "\t"
				+ lanes[3].size() + "\n");
	}
}
