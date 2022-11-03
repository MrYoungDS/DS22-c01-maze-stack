package queue;

/**
 * A {@link QueueUnderflowException} is thrown at runtime when an operation that would
 * return or manipulate the front most element of a queue that is empty is called.
 * @author jcollard, jddevaug
 */
public class QueueUnderflowException extends RuntimeException {

    // TONOTDO: please do not edit this class

    private static final long serialVersionUID = 1L;

    public QueueUnderflowException() {
        super();
    }

    public QueueUnderflowException(String message) {
        super(message);
    }
}