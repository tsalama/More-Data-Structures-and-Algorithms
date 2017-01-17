/** Tarek Salama
 * Sets up an exception for an empty collection. - from Ch. 12 powerpoint.
 */

public class EmptyCollectionException extends RuntimeException
{
    /**
     * Sets up this exception with an appropriate message.
     * @param collection the name of the collection
     */
    public EmptyCollectionException(String collection)
    {
        super("The " + collection + " is empty.");
    }
}
