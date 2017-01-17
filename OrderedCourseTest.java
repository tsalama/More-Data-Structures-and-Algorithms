/**
 * This program arranges a list of courses into an list ordered by prefix & number.
 * @author Tarek Salama
 */
public class OrderedCourseTest {

	public static void main(String[] args) {

		OrderedList<Course> courseList = new OrderedList<Course>();

		Course course1 = new Course("PSY", 101, "Introductory Psychology", "A");
		Course course2 = new Course("MAT", 243, "Discrete Math", "B+");
		Course course3 = new Course("CSE", 205, "Object Oriented Programming", "A-");
		Course course4 = new Course("PHY", 131, "University Physics II", "C");
		Course course5 = new Course("CSE", 120, "Digital Design Fundamentals");

		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);
		courseList.add(course4);
		courseList.add(course5);

		/**
		 * compareTo test
		 */
		System.out.println("compareTo Test (Positive = after & Negative = before):\nDoes \""
				+ course1 + "\" come before or after \"" + course2 + "\"?\n"
				+ (course1.compareTo(course2)) + "\n");

		/**
		 * Ordered courses
		 */
		System.out.println("ORDERED COURSE LIST:");
		for (Course course : courseList) {
			System.out.println(course);
		}
	}
}
