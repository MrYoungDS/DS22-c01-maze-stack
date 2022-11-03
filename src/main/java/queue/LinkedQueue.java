package queue;

/**
 * A {@link LinkedQueue} is a queue that is implemented using a Linked List structure
 * to allow for unbounded size.
 *
 * @param <T> the elements stored in the stack
 */
public class LinkedQueue<T> implements QueueInterface<T>
{

    QNode<T> front;
    QNode<T> rear;
    int size;

    /**
     * {@inheritDoc}.
     */
    @Override
    public T dequeue() throws QueueUnderflowException {
        // TODO: Implement the dequeue method, which will be
        //   similar to the removeLast method for a LinkedList
        //   (which was not included in our MyLinkedList project,
        //   but is a special case of our remove method).
        //   If the list is empty you should throw an exception.
        return null;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public T first() throws QueueUnderflowException {
        // TODO: Implement the front method, which will be
        //   similar to the getLast method for a LinkedList
        //   (which was not included in our MyLinkedList project,
        //   but is a special case of our get method).
        //   If the list is empty you should throw an exception.
        return null;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public void enqueue(T elem) {
        // TODO: Implement the enqueue method, which will be
        //   similar to the addFirst method for a LinkedList.
    }
}
