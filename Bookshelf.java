/* Tarek Salama
   This driver class demonstrates different setter and getter methods for 4 book objects */

public class Bookshelf
{
	public static void main (String[] args)
	{
	/* Object instantiation & constructor test */
	Book book1 = new Book("Holes", "Louis Sachar", "Yearling", "1/14/2000");
	Book book2 = new Book("Loser", "Jerry Spinelli", "HarperCollins", "8/11/2002");
	Book book3 = new Book("1984", "George Orwell", "Secker", "6/24/1949");
	Book book4 = new Book("Lord of the Flies", "Wiliam Golding", "Faber and Faber", "12/09/1954");


	/* Tests toString method for book 1 */
	System.out.println("Book 1 Description: \n" + book1.toString());



	/* Tests title getter and setter methods for book 1 */
	System.out.println("Book 1 Title: " + book1.getTitle());

	book1.setTitle("Harry Potter");

	System.out.println("Updated Book 1 Title: " + book1.getTitle() + "\n");



	/* Tests author getter and setter methods for book 2 */
	System.out.println("Book 2 Author: " + book2.getAuthor());

	book2.setAuthor("Stephen King");

	System.out.println("Updated Book 2 Author: " + book2.getAuthor() + "\n");



	/* Tests publisher getter and setter methods for book 3 */
	System.out.println("Book 3 Publisher: " + book3.getPublisher());

	book3.setPublisher("Chronicle");

	System.out.println("Updated Book 3 Publisher: " + book3.getPublisher() + "\n");



	/* Tests copyright date getter and setter methods for book 4 */
	System.out.println("Book 4 Copyright Date: " + book4.getDate());

	book4.setDate("5/29/2015");

	System.out.println("Updated Book 4 Copyright Date: " + book4.getDate() + "\n");
	}
}