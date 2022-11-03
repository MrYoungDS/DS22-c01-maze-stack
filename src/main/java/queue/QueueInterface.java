package queue;

/**
 * A {@link QueueInterface} represents a first-in-first-out (FIFO)
 * stack of objects.
 * @author jcollard, jddevaug
 * @param <T> the type of elements in the queue
 */
public interface QueueInterface<T> {

    // TONOTDO: please do not edit this class

    /**
     * Removes the front most element on this queue. For convenience,
     * the front most element is returned
     * @return the front most element of this queue is returned
     * @throws QueueUnderflowException if the queue is empty.
     */
    public T dequeue() throws QueueUnderflowException;

    /**
     * Returns the front most element of this queue.
     * @return the front most element of this queue.
     * @throws QueueUnderflowException if the queue is empty
     */
    public T first() throws QueueUnderflowException;

    /**
     * Pushes {@code elem} to the rear of this queue.
     */
    public void enqueue(T elem);

    /**
     * Returns {@code true} if the queue contains no elements and {@code false} otherwise.
     * @return {@code true} if the queue contains no elements and {@code false} otherwise.
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements in this queue.
     * @return the number of elements in this queue.
     */
    public int size();
}
