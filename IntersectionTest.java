/**
 * Runs default simulation then runs user-defined simulation.
 */

import java.util.Scanner;

public class IntersectionTest {

	public static void main(String[] args) {

		System.out.println("Default intersection:\nEach street has a 25%"
				+ " chance to get a new car each second.\n"
				+ "Light changes from red to green every 10 seconds.\n"
				+ "Simulation length is 1000 seconds.\n");

		NewCar o = new NewCar(.25);
		Intersection intersection = new Intersection(o, 10);

		intersection.simulate();
		intersection.results();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a new car creation chance (0.00 - 1.00): ");
		double chance = scan.nextDouble();
		o = new NewCar(chance);

		System.out.print("Enter a new duration for traffic light (seconds): ");
		int lightDuration = scan.nextInt();
		intersection = new Intersection(o, lightDuration);

		System.out.println("Your intersection:\nEach street has a "
				+ chance * 100 + "% chance to get a new car each second.\n"
				+ "Light changes from red to green every " + lightDuration
				+ " seconds.\n" + "Simulation length is 1000 seconds.\n");

		intersection.simulate();
		intersection.results();
	}
}
