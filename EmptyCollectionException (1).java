public class EmptyCollectionException extends RuntimeException {
	/**
	* Creates an exception for an empty collection.
	* @param collection - the name of the collection
	*/
	public EmptyCollectionException(String collection) {
		super("The " + collection + " is empty.");
	}
}
