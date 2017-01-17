public class ElementNotFoundException extends RuntimeException {
	/**
	* Creates an exception for an element which cannot be found.
	* @param collection - the name of the collection
	*/
	public ElementNotFoundException(String collection) {
		super("The " + collection + " element cannot be found.");
	}
}