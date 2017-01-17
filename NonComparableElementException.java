class NonComparableElementException extends RuntimeException {
	/**
	* Creates an exception for an element which is not "comparable".
	* @param collection - the name of the collection
	*/
	public NonComparableElementException(String collection) {
		super("The " + collection + " element is not comparable.");
	}

}