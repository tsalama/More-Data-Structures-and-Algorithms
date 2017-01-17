/* Tarek Salama
   This class creates 4 instance variables for a book description and
   create setter and getter methods for each variable. */

public class Book
{
	/* Instance variables */
	private String title;
	private String author;
	private String publisher;
	private String date;

	/* Constructor */
	public Book(String inTitle, String inAuthor, String inPublisher, String inDate)
	{
	  title = inTitle;
	  author = inAuthor;
	  publisher = inPublisher;
	  date = inDate;
	}


	/* Title setter */
	public void setTitle(String titleInput)
	{
		title = titleInput;
	}

	/* Title getter */
	public String getTitle()
	{
		return title;
	}


	/* Author setter */
	public void setAuthor(String authorInput)
	{
		author = authorInput;
	}

	/* Author gettter */
	public String getAuthor()
	{
		return author;
	}


	/* Publisher setter */
	public void setPublisher(String publisherInput)
	{
		publisher = publisherInput;
	}

	/* Publisher getter */
	public String getPublisher()
	{
		return publisher;
	}


	/* Copyright date setter */
	public void setDate(String dateInput)
	{
		date = dateInput;
	}

	/* Copyright date getter */
	public String getDate()
	{
		return date;
	}


	/* toString method which neatly displays book object description */
	public String toString()
	{
		String description = "";

		description += "Title: " + title + "\n";
		description += "Author: " + author + "\n";
		description += "Publisher: " + publisher + "\n";
		description += "Copyright Date: " + date + "\n";

		return description;
	}
}